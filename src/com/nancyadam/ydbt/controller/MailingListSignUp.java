package com.nancyadam.ydbt.controller;

import com.nancyadam.ydbt.entity.User;
import com.nancyadam.ydbt.persistence.UserDao;
import com.nancyadam.ydbt.persistence.UserDaoWithHibernate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
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
        name = "mailingListSignUp",
        urlPatterns = { "/signUp" }
)

public class MailingListSignUp extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ServletContext servletContext = getServletContext();
        HttpSession session = request.getSession();
        String addMessage = "";


        String username = request.getParameter("username");
        String userpass = request.getParameter("userpass");
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String email = request.getParameter("email");

        UserDaoWithHibernate userDao = new UserDaoWithHibernate();

        User user = new User();

        user.setUserName(username);
        user.setUserPass(userpass);
        user.setFirstName(firstname);
        user.setLastName(lastname);
        user.setEmail(email);

        userDao.addUser(user);

        /*tests if last name has a value, if so runs the method to
            add the user to the database displaying the appropriate message*/
        if (lastname.length() != 0 || !lastname.equals("")){
            userDao.addUser(user);
        } else {
            addMessage = "Please try again!";
        }
        session.setAttribute("addMessage", addMessage);

        String url = "/index.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);

    }
}
