package com.example.qoc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FeedRecyclerAdapter extends RecyclerView.Adapter<FeedRecyclerAdapter.myViewHolder> {

    ArrayList<FeedModel> dataholder;

    public FeedRecyclerAdapter(ArrayList<FeedModel> holder) {
        this.dataholder = holder;
    }


    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.feed_row,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.usern.setText(dataholder.get(position).getUsername());
        holder.uid.setText(dataholder.get(position).getUserid());
        holder.content.setText(dataholder.get(position).getPostcontent());

    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {

        TextView usern,uid,content;
        LinearLayout linearLayout;


        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            usern = itemView.findViewById(R.id.username);
            uid = itemView.findViewById(R.id.userid);
            content = itemView.findViewById(R.id.feedcontent);
            linearLayout = itemView.findViewById(R.id.feedrow);
        }
    }
}
