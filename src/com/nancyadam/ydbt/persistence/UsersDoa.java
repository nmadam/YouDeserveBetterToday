package com.nancyadam.ydbt.persistence;

import com.nancyadam.ydbt.entity.Users;

//import javax.xml.registry.infomodel.Users;
import java.util.List;

/**
 * Created by Nancy on 2/28/2016.
 * @author nancyadam
 * @version 1.0 02/28/16
 */
public interface UsersDoa {
    /**
     * Return a list of all users
     * @return all users
     */
    public List<Users> getAllUsers();

    /**
     * Update a user
     * @param user update user
     */
    public void updateUser(Users user);

    /**
     * Delete a user
     *
     *  @param user to be deleted
     */
    public void deleteUser(Users user);

    /**
     * Add a user
     *
     * @param user to be added
     * @return id of the inserted user
     */
    public int addUser(Users user);

}
