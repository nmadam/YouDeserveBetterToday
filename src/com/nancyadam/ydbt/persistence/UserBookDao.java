package com.nancyadam.ydbt.persistence;
import com.nancyadam.ydbt.entity.UserBook;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Student on 5/6/2016.
 */
public class UserBookDao {

    public void addUserBook(UserBook userBook) {
        Session session = SessionFactoryProvider1.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.save("UserBook", userBook);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

    }

}


