package com.nancyadam.ydbt.controller;

import com.nancyadam.ydbt.entity.Book;
import com.nancyadam.ydbt.entity.User;
import com.nancyadam.ydbt.entity.UserBook;
import com.nancyadam.ydbt.persistence.BookDao;
import com.nancyadam.ydbt.persistence.UserBookDao;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Created by Student on 5/6/2016.
 */

@WebServlet(
        name = "viewReviews",
        urlPatterns = { "/admin/viewReviews" }
)

public class ViewReviews extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        UserBookDao userBookDao = new UserBookDao();
        BookDao bookDao = new BookDao();

        List<UserBook> userBooks = userBookDao.getAllRatings();
        List<Book> books = bookDao.getAllBookInformation();

        HttpSession session = request.getSession();

        session.setAttribute("userBooks", userBooks);
        session.setAttribute("books", books);

        String url = "/viewReviews.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);

    }
}
