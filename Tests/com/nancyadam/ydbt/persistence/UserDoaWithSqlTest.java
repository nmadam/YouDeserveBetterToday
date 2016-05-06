package com.nancyadam.ydbt.persistence;

import com.nancyadam.ydbt.entity.User;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Nancy
 * @version 1.0 3/6/2016
 */
public class UserDoaWithSqlTest {

    @Test
    public void testGetAllUsers() throws Exception {
        UserDaoWithSql doaWithSql = new UserDaoWithSql();
        List<User> users = doaWithSql.getAllUsers();
        assertTrue(users.size() > 0);
    }

    @Test
    public void testUpdateUser() throws Exception {

    }

    @Test
    public void testDeleteUser() throws Exception {

    }

    @Test
    public void testAddUser() throws Exception {

    }
}
