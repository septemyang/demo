package com.example.demo.dao;

public class User {
    private int id;
    private String username;
    private String userpassword;
    private int userage;
    private String userroll;
    public User(){

    }
    public User(int id, String username, String userpassword, int userage, String userroll ){
        this.id=id;
        this.username=username;
        this.userpassword=userpassword;
        this.userage=userage;
        this.userroll=userroll;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public int getUserage() {
        return userage;
    }

    public void setUserage(int userage) {
        this.userage = userage;
    }

    public String getUserroll() {
        return userroll;
    }

    public void setUserroll(String userroll) {
        this.userroll = userroll;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", userpassword='" + userpassword + '\'' +
                ", userage=" + userage +
                ", userroll='" + userroll + '\'' +
                '}';
    }


}
