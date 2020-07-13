package com.example.demo.dao;

public class User {
    private int userid;
    private String username;
    private String userpassword;
    private int userage;
    private String userroll;
    public User(){

    }
    public User(int userid, String username, String userpassword, int userage, String userroll ){
        this.userid=userid;
        this.username=username;
        this.userpassword=userpassword;
        this.userage=userage;
        this.userroll=userroll;

    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
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
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userpassword='" + userpassword + '\'' +
                ", userage=" + userage +
                ", userroll='" + userroll + '\'' +
                '}'+"<br>";
    }


}
