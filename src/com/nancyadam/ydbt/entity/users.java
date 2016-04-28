package com.nancyadam.ydbt.entity;

/**
 * @author nancyadam
 * @version 1.0 2/28/2016
 */
public class Users {
    private int userId;
    private String userName;
    private String userPass;
    private String lastName;
    private String firstName;
    private String email;

    public Users() {
    }

    public Users(int userId, String userName, String userPass, String lastName, String firstName, String email) {
        this.userId = userId;
        this.userName = userName;
        this.userPass = userPass;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
    }

    /**/
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
