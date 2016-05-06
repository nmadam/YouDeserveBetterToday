package com.nancyadam.ydbt.entity;

/**
 * Created by Nancy on 2/22/2016.
 */
public class UserRole {
    private String userName;
    private String roleName;

    public UserRole() {
    }

    public UserRole(String userName, String roleName) {
        this.userName = userName;
        this.roleName = roleName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
