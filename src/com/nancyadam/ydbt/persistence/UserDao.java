package com.nancyadam.ydbt.persistence;

import com.nancyadam.ydbt.entity.User;

//import javax.xml.registry.infomodel.User;
import java.util.List;

/**
 * Created by Nancy on 2/28/2016.
 * @author nancyadam
 * @version 1.0 02/28/16
 */
public interface UserDao {
    /**
     * Return a list of all users
     * @return all users
     */
    public List<User> getAllUsers();

    /**
     * Update a user
     * @param user update user
     */
    public void updateUser(User user);

    /**
     * Delete a user
     *
     *  @param user to be deleted
     */
    public void deleteUser(User user);

    /**
     * Add a user
     *
     * @param user to be added
     * @return id of the inserted user
     */
    public int addUser(User user);

}
