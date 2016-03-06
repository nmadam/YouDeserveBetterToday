package com.nancyadam.ydbt.persistence;

import com.nancyadam.ydbt.entity.Users;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Nancy
 * @version 1.0 3/6/2016
 */
public class UsersDoaWithSqlTest {

    @Test
    public void testGetAllUsers() throws Exception {
        UsersDoaWithSql doaWithSql = new UsersDoaWithSql();
        List<Users> users = doaWithSql.getAllUsers();
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
