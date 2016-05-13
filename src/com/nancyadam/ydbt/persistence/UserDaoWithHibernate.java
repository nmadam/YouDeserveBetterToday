package com.nancyadam.ydbt.persistence;

import com.nancyadam.ydbt.entity.User;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;


/**
 * @author Nancy
 * @version 1.0 2/28/2016
 */
public class UserDaoWithHibernate implements UserDao {
    private final Logger log = Logger.getLogger(this.getClass());

    /**
     *
     * @return users a list of all the users
     *
     */
    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();

        Session session = SessionFactoryProvider1.getSessionFactory().openSession();
        users = session.createCriteria(User.class).list();
        session.close();
        return users;
    }

    /**
     *
     * @param userId user Id of the user
     * @return the user
     */
    @Override
    public User selectUser(int userId) {
        User user = null;
        Session session = SessionFactoryProvider1.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            user = (User) session.get(User.class, userId);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            log.error(e);
        } finally {
            session.close();
        }
        return user;
    }

    /**
     *
     * @param user to be deleted
     */
    @Override
    public void deleteUser(User user) {
        Session session = SessionFactoryProvider1.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.delete(user);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx. rollback();
            log.error(e);
        } finally {
            session.close();
        }
    }

    /**
     *
     * @param user to be added
     * @return userId
     */
    @Override
    public int addUser(User user) {

        Session session = SessionFactoryProvider1.getSessionFactory().openSession();
        Transaction tx = null;
        Integer userId = 0;
        try {
            tx = session.beginTransaction();
            userId = (Integer) session.save("User", user);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            log.error(e);
        } finally {
            session.close();
        }
        return userId;
    }

}
