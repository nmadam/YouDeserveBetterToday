package com.nancyadam.ydbt.controller;

import com.nancyadam.ydbt.entity.Book;
import com.nancyadam.ydbt.entity.UserBook;
import com.nancyadam.ydbt.persistence.BookDao;
import com.nancyadam.ydbt.persistence.UserBookDao;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Student on 5/6/2016.
 */
@WebServlet(
        name = "addBookReview",
        urlPatterns = { "/addBookReview" }
)

public class AddBookReview extends HttpServlet {

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
