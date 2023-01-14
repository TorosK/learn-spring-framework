package com.in28minutes.learnspringframework;

public class User {
    int uID;
    String uFirstName;
    String uLastName;
    String uEmail;
    String uUserName;

    public User() {

    }

    public User(int uID, String uFirstName, String uLastName, String uEmail, String uUserName) {
        this.uID = uID;
        this.uFirstName = uFirstName;
        this.uLastName = uLastName;
        this.uEmail = uEmail;
        this.uUserName = uUserName;
    }

    public int getuID() {
        return uID;
    }

    public void setuID(int uID) {
        this.uID = uID;
    }

    public String getuFirstName() {
        return uFirstName;
    }

    public void setuFirstName(String uFirstName) {
        this.uFirstName = uFirstName;
    }

    public String getuLastName() {
        return uLastName;
    }

    public void setuLastName(String uLastName) {
        this.uLastName = uLastName;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getuUserName() {
        return uUserName;
    }

    public void setuUserName(String uUserName) {
        this.uUserName = uUserName;
    }

    @Override
    public String toString() {
        return "User{" +
                "uID=" + uID +
                ", uFirstName='" + uFirstName + '\'' +
                ", uLastName='" + uLastName + '\'' +
                ", uEmail='" + uEmail + '\'' +
                ", uUserName='" + uUserName + '\'' +
                '}';
    }
}
