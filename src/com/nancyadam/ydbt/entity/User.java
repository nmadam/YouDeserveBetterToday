package com.nancyadam.ydbt.entity;

/**
 * @author nancyadam
 * @version 1.0 2/28/2016
 *
 * Java Bean for User table
 */
public class User {
    private int userId;
    private String userName;
    private String userPass;
    private String lastName;
    private String firstName;
    private String email;

    /**
     * Empty Constructor
     */
    public User() {
    }

    /**
     * Constructor that accepts the user id, user name, user password, last name, first name and email parameters
     *
     * @param userId
     * @param userName
     * @param userPass
     * @param lastName
     * @param firstName
     * @param email
     */
    public User(int userId, String userName, String userPass, String lastName, String firstName, String email) {
        this.userId = userId;
        this.userName = userName;
        this.userPass = userPass;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
    }

    /**
     * Sets new userId.
     *
     * @param userId New value of userId.
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }
    /**
     * Gets lastName.
     *
     * @return Value of lastName.
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * Gets firstName.
     *
     * @return Value of firstName.
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Sets new userName.
     *
     * @param userName New value of userName.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    /**
     * Gets email.
     *
     * @return Value of email.
     */
    public String getEmail() {
        return email;
    }
    /**
     * Sets new email.
     *
     * @param email New value of email.
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Gets userName.
     *
     * @return Value of userName.
     */
    public String getUserName() {
        return userName;
    }
    /**
     * Gets userId.
     *
     * @return Value of userId.
     */
    public int getUserId() {
        return userId;
    }
    /**
     * Sets new userPass.
     *
     * @param userPass New value of userPass.
     */
    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }
    /**
     * Gets userPass.
     *
     * @return Value of userPass.
     */
    public String getUserPass() {
        return userPass;
    }
    /**
     * Sets new firstName.
     *
     * @param firstName New value of firstName.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Sets new lastName.
     *
     * @param lastName New value of lastName.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
