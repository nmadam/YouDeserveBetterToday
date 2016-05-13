package com.nancyadam.ydbt.controller;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(
        name = "logoutUser",
        urlPatterns = { "/logoutUser" }
)

/**
 * Created by nancyadam on 5/11/2016.
 *
 * @version 1.1
 *
 * Servlet that will logout the user
 */
public class LogoutUser extends HttpServlet {
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

        request.logout();
        response.sendRedirect("index.jsp");
    }
}
