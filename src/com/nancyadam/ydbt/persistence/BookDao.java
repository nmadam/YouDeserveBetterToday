package com.nancyadam.ydbt.persistence;

import com.nancyadam.ydbt.entity.Book;
import com.nancyadam.ydbt.persistence.SessionFactoryProvider1;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by Student on 5/6/2016.
 */
public class BookDao {



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


