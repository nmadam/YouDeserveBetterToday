package com.nancyadam.ydbt.persistence;

import com.nancyadam.ydbt.entity.Book;
import com.nancyadam.ydbt.entity.User;
import com.nancyadam.ydbt.persistence.SessionFactoryProvider1;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Student on 5/6/2016.
 */
public class BookDao {
    private final Logger log = Logger.getLogger(this.getClass());

    public List<Book> getAllBookInformation() {
        List<Book> books = new ArrayList<Book>();

        Session session = SessionFactoryProvider1.getSessionFactory().openSession();
        books = session.createCriteria(Book.class).list();
        session.close();
        return books;
    }

    public int addBook(Book book) {
        Session session = SessionFactoryProvider1.getSessionFactory().openSession();
        Transaction tx = null;
        Integer bookId = 0;

        try {
            tx = session.beginTransaction();
            bookId = (Integer) session.save("Book", book);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            log.error(e);
        } finally {
            session.close();
        }
        return bookId;
    }

}


