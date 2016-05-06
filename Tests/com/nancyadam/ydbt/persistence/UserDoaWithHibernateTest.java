package com.nancyadam.ydbt.persistence;

import com.nancyadam.ydbt.entity.User;
import org.junit.Test;
/*
import javax.ejb.TransactionAttribute;
import javax.xml.registry.infomodel.User;
import java.util.List;

import static org.junit.Assert.assertEquals;
*/
import static org.junit.Assert.assertTrue;

/**
 * @author Nancy Adam
 * @version 1.0 3/6/2016
 */
public class UserDoaWithHibernateTest {

    @Test
    public void testGetAllUsers() throws Exception {

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
