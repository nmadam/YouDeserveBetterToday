package com.nancyadam.ydbt.persistence;

import com.nancyadam.ydbt.entity.Book;
import com.nancyadam.ydbt.entity.User;
import com.nancyadam.ydbt.persistence.SessionFactoryProvider1;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Student on 5/6/2016.
 */
public class BookDao {


    public List<Book> getAllBookInformation() {
        List<Book> books = new ArrayList<Book>();

        Session session = SessionFactoryProvider1.getSessionFactory().openSession();
        books = session.createCriteria(Book.class).list();
        session.close();
        return books;
    }



    public void addBook(Book book) {
        Session session = SessionFactoryProvider1.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save("Book", book);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

    }

}


