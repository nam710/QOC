package com.example.qoc;

public class FeedModel {
    String username,userid,postcontent;


    public FeedModel(String Username, String Userid,String Postcontent) {
       username = Username;
       userid = Userid;
       postcontent = Postcontent;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPostcontent() {
        return postcontent;
    }

    public void setPostcontent(String postcontent) {
        this.postcontent = postcontent;
    }
}
