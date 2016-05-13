package com.nancyadam.ydbt.controller;

import com.nancyadam.ydbt.entity.User;
import com.nancyadam.ydbt.persistence.UserDaoWithHibernate;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by adamnancy on 5/6/2016.
 * @version 1.1
 *
 * Servlet that will list all of the book reviews seen only by the administrator
 */

@WebServlet(
        name = "viewMailingList",
        urlPatterns = { "/viewMailingList" }
)

public class ViewMailList extends HttpServlet {
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

        UserDaoWithHibernate userDao = new UserDaoWithHibernate();

        List<User> allUsers = userDao.getAllUsers();

        HttpSession session = request.getSession();

        session.setAttribute("allUsers", allUsers);

        String url = "/viewMailingList.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);

    }
}
