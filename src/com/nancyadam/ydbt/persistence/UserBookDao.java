package com.nancyadam.ydbt.persistence;
import com.nancyadam.ydbt.entity.User;
import com.nancyadam.ydbt.entity.UserBook;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adamnancy on 5/6/2016.
 *
 * @version 1.1
 *
 * Dao that mataches user book table
 */
public class UserBookDao {
    private final Logger log = Logger.getLogger(this.getClass());

    /**
     *
     * @return userBooks a list of all user books
     */
    public List<UserBook> getAllRatings() {
        List<UserBook> userBooks = new ArrayList<UserBook>();

        Session session = SessionFactoryProvider1.getSessionFactory().openSession();
        userBooks = session.createCriteria(UserBook.class).list();
        session.close();
        return userBooks;
    }

    /**
     *
     * @param bookId the book id
     * @return userBook the user book
     */
    public UserBook selectUserBook(int bookId) {
        UserBook userBook = null;
        Session session = SessionFactoryProvider1.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            userBook = (UserBook) session.get(UserBook.class, bookId);
            tx.commit();
            log.info("Found the User Book with Id: " + bookId);
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            log.error(e);
        } finally {
            session.close();
        }
        return userBook;
    }

    /**
     *
     * @param userBook a list of your comments and ratings of a book
     */
    public void deleteUserBook(UserBook userBook) {
        Session session = SessionFactoryProvider1.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.delete(userBook);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            log.error(e);
        } finally {
            session.close();
        }
    }

    /**
     *
      * @param userBook a list of your comments and ratings of a book
     */
    public void addUserBook(UserBook userBook) {
        Session session = SessionFactoryProvider1.getSessionFactory().openSession();
        Transaction tx = null;


        try {
            tx = session.beginTransaction();
            session.save("UserBook", userBook);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            log.error(e);
        } finally {
            session.close();
        }
    }

}


