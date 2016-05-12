package com.nancyadam.ydbt.entity;

import java.io.Serializable;

/**
 * Created by Nancy on 2/22/2016.
 *
 * Java Bean for user_roles table
 */
public class UserRole implements Serializable {
    private String userName;
    private String roleName;

    /**
     * Empty Constructor
     */
    public UserRole() {
    }

    /**
     * Constructor that accepts the user name and role name parameters
     * @param userName
     * @param roleName
     */
    public UserRole(String userName, String roleName) {
        this.userName = userName;
        this.roleName = roleName;
    }

    /**
     * Sets new roleName.
     *
     * @param roleName New value of roleName.
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    /**
     * Gets roleName.
     *
     * @return Value of roleName.
     */
    public String getRoleName() {
        return roleName;
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
     * Sets new userName.
     *
     * @param userName New value of userName.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
