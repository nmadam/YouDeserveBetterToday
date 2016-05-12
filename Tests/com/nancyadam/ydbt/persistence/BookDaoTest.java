package com.nancyadam.ydbt.persistence;

import com.nancyadam.ydbt.entity.Book;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Student on 5/12/2016.
 */
public class BookDaoTest {
    private final Logger log = Logger.getLogger(this.getClass());

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetAllBookInformation() throws Exception {

        BookDao bookDao = new BookDao();
        List<Book> books = bookDao.getAllBookInformation();
        assertTrue(books.size() > 0);
    }

    @Test
    public void testAddBook() throws Exception {

        BookDao bookDao = new BookDao();

        int insertedBookId = 0;
        Book book = new Book();

        book.setBookAuthor("My Test");
        book.setBookTitle("Running Tests");

        insertedBookId = bookDao.addBook(book);
        assertTrue(insertedBookId > 0);
    }
}