package com.example.kristinaneel.attendance;

/**
 * Created by kristinaneel on 2/1/2017.
 */


public class User {
    private int userId;
    private String password;

    public User(int userId,String password){
        this.userId = userId;
        this.password = password;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




}