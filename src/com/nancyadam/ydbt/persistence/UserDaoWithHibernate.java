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

    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();

        Session session = SessionFactoryProvider1.getSessionFactory().openSession();
        users = session.createCriteria(User.class).list();
        session.close();
        return users;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(User user) {

    }

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
