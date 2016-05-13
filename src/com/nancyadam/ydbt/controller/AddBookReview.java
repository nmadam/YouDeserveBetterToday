package com.nancyadam.ydbt.controller;

import com.nancyadam.ydbt.entity.Book;
import com.nancyadam.ydbt.entity.UserBook;
import com.nancyadam.ydbt.persistence.BookDao;
import com.nancyadam.ydbt.persistence.UserBookDao;
import org.apache.log4j.Logger;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by nancyadam on 5/6/2016.
 * @version 1.1
 * Servlet used to add the user's book review seen only by the administrator
 */
@WebServlet(
        name = "addBookReview",
        urlPatterns = { "/addBookReview" }
)

public class AddBookReview extends HttpServlet {
    private final Logger log = Logger.getLogger(this.getClass());

    /**
     * Handles HTTP GET requests.
     *
     *@param request                the HttpServletRequest object
     *@param response               the HttpServletResponse object
     *@exception ServletException   if there is a Servlet failure
     *@exception IOException        if there is an IO failure
     */

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String rating = request.getParameter("rating");
        String bookComment = request.getParameter("bookComment");

        UserBookDao userBookDao = new UserBookDao();
        BookDao bookDao = new BookDao();

        UserBook userBook = new UserBook();
        Book book = new Book();

        book.setBookTitle(title);
        book.setBookAuthor(author);
        userBook.setRating(rating);
        userBook.setComment(bookComment);

        userBookDao.addUserBook(userBook);
        bookDao.addBook(book);


        String url = "/index.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);

    }
}
