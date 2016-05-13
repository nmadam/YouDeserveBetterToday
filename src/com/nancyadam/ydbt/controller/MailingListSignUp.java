package com.nancyadam.ydbt.controller;

import com.nancyadam.ydbt.entity.User;
import com.nancyadam.ydbt.persistence.UserDao;
import com.nancyadam.ydbt.persistence.UserDaoWithHibernate;
import org.apache.log4j.Logger;

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
 * Created by adamnancy on 5/6/2016.
 * version 1.1
 *
 * Servlet that will list all of the users in the database viewed by the administrator only
 */

@WebServlet(
        name = "mailingListSignUp",
        urlPatterns = { "/signUp" }
)

public class MailingListSignUp extends HttpServlet {
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

        ServletContext servletContext = getServletContext();
        HttpSession session = request.getSession();
        String addMessage = "";

        //Retrieve the user-entered information from the form
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


        /*tests if last name has a value, if so runs the method to
            add the user to the database displaying the appropriate message*/
        if ((lastname.length() != 0 && !lastname.equals("")) && (firstname.length() != 0 && !firstname.equals(""))){
            userDao.addUser(user);
        } else {
            addMessage = "Please try again!";
            session.setAttribute("addMessage", addMessage);
            String url = "/mailingListSignUp.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);
        }

        String url = "/index.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);

    }
}
