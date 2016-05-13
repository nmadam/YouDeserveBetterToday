package com.nancyadam.ydbt.persistence;

import com.nancyadam.ydbt.entity.User;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Student on 5/12/2016.
 */
public class UserDaoWithHibernateTest {
    private final Logger log = Logger.getLogger(this.getClass());

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetAllUsers() throws Exception {
        UserDaoWithHibernate dao = new UserDaoWithHibernate();  // create a test object
        List<User> users = dao.getAllUsers(); // test the method
        assertTrue(users.size() > 0);  // check if the list contains any objects
    }

    @Test
    public void testSelectUser() throws Exception {

    }

    @Test
    public void testDeleteUser() throws Exception {

    }

    @Test
    public void testAddUser() throws Exception {
        UserDaoWithHibernate userDaoWithHibernate = new UserDaoWithHibernate();

        User user = new User();

        user.setUserName("Test");
        user.setFirstName("Testfirstname");
        user.setLastName("Testlastname");
        user.setEmail("Testing@gmail.com");
        user.setUserPass("test");


        int userId = userDaoWithHibernate.addUser(user);

        String userName = user.getUserName();

        assertTrue(userName.equals("Test"));

        user = userDaoWithHibernate.selectUser(userId);
        userDaoWithHibernate.deleteUser(user);
    }
}