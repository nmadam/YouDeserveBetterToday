package com.nancyadam.ydbt.persistence;

import com.nancyadam.ydbt.entity.User;
import com.nancyadam.ydbt.entity.UserBook;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Student on 5/12/2016.
 */
public class UserBookDaoTest {
    private final Logger log = Logger.getLogger(this.getClass());

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetAllRatings() throws Exception {
        UserBookDao userBookDao = new UserBookDao();
        List<UserBook> userBooks = userBookDao.getAllRatings();
        assertTrue(userBooks.size() > 0);
    }

    @Test
    public void testSelectUserBook() {
        UserBookDao userBookDao = new UserBookDao();

        UserBook userBook = new UserBook();

        userBook.setComment("This user book will be selected");
        userBook.setRating("5 star");
        userBook.setUserId(100);
        userBook.setBookId(100);
        userBookDao.addUserBook(userBook);

        List<UserBook> userBookRatings = userBookDao.getAllRatings();

        int numberOfBooks = 0;
        for (UserBook userBookRating : userBookRatings) {
            if (userBookRating.getBookId() == 100) {
                numberOfBooks++;
            }
            assertTrue(numberOfBooks == 1);
        }
        userBookDao.deleteUserBook(userBook);
    }



    @Test
    public void testDeleteUserBook() throws Exception {

        UserBookDao userBookDao = new UserBookDao();

        UserBook userBook = new UserBook();

        userBook.setComment("This should be deleted");
        userBook.setRating("5 star");
        userBook.setUserId(16);
        userBook.setBookId(16);
        userBookDao.addUserBook(userBook);

        userBookDao.deleteUserBook(userBook);

        UserBook userBook1 = userBookDao.selectUserBook(16);

        assertNull(userBook1);
    }


    @Test
    public void testAddUserBook() throws Exception {

        UserBookDao userBookDao = new UserBookDao();

        UserBook userBook = new UserBook();

        userBook.setComment("This will insert if the test is successful");
        userBook.setRating("5 star");
        userBook.setUserId(16);
        userBook.setBookId(16);
        userBookDao.addUserBook(userBook);

        List<UserBook> userBookRatings = userBookDao.getAllRatings();

        int numberOfBooks = 0;
        for (UserBook userBookRating : userBookRatings) {
            if (userBookRating.getBookId() == 16) {
                numberOfBooks++;
            }
            assertTrue(numberOfBooks == 1);
        }
        userBookDao.deleteUserBook(userBook);
    }
}