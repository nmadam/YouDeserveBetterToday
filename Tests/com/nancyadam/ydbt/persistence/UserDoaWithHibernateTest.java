package com.nancyadam.ydbt.persistence;

import com.nancyadam.ydbt.entity.User;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.junit.Test;
/*
import javax.ejb.TransactionAttribute;
import javax.xml.registry.infomodel.User;
import java.util.List;

import static org.junit.Assert.assertEquals;
*/
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.*;

/**
 * @author Nancy Adam
 * @version 1.0 3/6/2016
 */
public class UserDoaWithHibernateTest {
    private final Logger log = Logger.getLogger(this.getClass());

    @Test
    public void testGetAllUsers() throws Exception {
        UserDaoWithHibernate dao = new UserDaoWithHibernate();  // create a test object
        List<User> users = dao.getAllUsers(); // test the method
        assertTrue(users.size() > 0);  // check if the list contains any objects
    }


    @Test
    public void testUpdateUser() throws Exception {

    }

    @Test
    public void testDeleteUser() throws Exception {

    }

    @Test
    public void testAddUser() throws Exception {
        UserDaoWithHibernate doa = new UserDaoWithHibernate();
        int insertedUserId = 0;
        //create user to add
        User user = new User();
        user.setUserName("nmadam");
        user.setFirstName("Nancy");
        user.setLastName("Meister");
        user.setEmail("nm.meister@hotmail.com");
        user.setUserPass("hello");


        insertedUserId = doa.addUser(user);

        assertTrue(insertedUserId > 0);
    }
}
