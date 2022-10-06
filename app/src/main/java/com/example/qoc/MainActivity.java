package com.example.qoc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    FloatingActionButton fabHome;
    RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        replaceFragment(new HomeFragment());

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        fabHome = findViewById(R.id.home);
        bottomNavigationView.getMenu().setGroupCheckable(0, false, true);


        bottomNavigationView.getMenu().getItem(2).setEnabled(false);
        fabHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFragment(new HomeFragment());
                bottomNavigationView.getMenu().setGroupCheckable(0, false, true);

            }
        });



        bottomNavigationView.setOnItemSelectedListener(item -> {

            switch (item.getItemId()) {

                case R.id.feed:

                    replaceFragment(new FeedFragment());
                    bottomNavigationView.getMenu().setGroupCheckable(0, true, true);
                    break;
                case R.id.post:

                    replaceFragment(new PostFragment());
                    bottomNavigationView.getMenu().setGroupCheckable(0, true, true);
                    break;
                case R.id.institutes:
                    replaceFragment(new InstitutesFragment());
                    bottomNavigationView.getMenu().setGroupCheckable(0, true, true);
                    break;
                case R.id.settings:
                    replaceFragment(new SettingsFragment());
                    bottomNavigationView.getMenu().setGroupCheckable(0, true, true);
                    break;
            }
            return true;

        });
        recyclerView = findViewById(R.id.recyclerView);





    }


    private void replaceFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }
}
