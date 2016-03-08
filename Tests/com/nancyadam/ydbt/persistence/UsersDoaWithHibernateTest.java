package com.nancyadam.ydbt.persistence;

import com.nancyadam.ydbt.entity.Users;
import org.junit.Test;

import javax.ejb.TransactionAttribute;
import javax.xml.registry.infomodel.User;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author Nancy Adam
 * @version 1.0 3/6/2016
 */
public class UsersDoaWithHibernateTest {

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
        UsersDoaWithHibernate doa = new UsersDoaWithHibernate();
        int insertedUserId = 0;
        //create user to add
        Users user = new Users();
        user.setUserName("nmadam");
        user.setFirstName("Nancy");
        user.setLastName("Meister");
        user.setEmail("nm.meister@hotmail.com");
        user.setUserPass("hello");


        insertedUserId = doa.addUser(user);

        assertTrue(insertedUserId > 0);
    }
}
