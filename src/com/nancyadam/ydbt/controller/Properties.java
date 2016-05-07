package com.nancyadam.ydbt.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Nancy Adam on 5/7/2016.
 */
@WebServlet(
        name = "properties",
        urlPatterns = { "/properties" }
)

public class Properties extends HttpServlet {
    /** holds properties information */
    /*How do I incorporate the new file structure for properties in Resources to call it?*/

   // Properties properties = new Properties();

    /**
     * Handles HTTP GET requests.
     *
     *@param request                the HttpServletRequest object
     *@param response               the HttpServletResponse object
     *@exception ServletException   if there is a Servlet failure
     *@exception IOException        if there is an IO failure
     */
   /* public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("properties", properties);

        String url = "/properties";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);

        dispatcher.forward(request, response);
    }*/

    /** Method that will load the project properties file into the Properties
     * instance variable.
     */
    /*private void loadProperties() {

        properties = new Properties();

        try {
            properties.load(this.getClass().getResourceAsStream("/Resources/properties"));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }*/

    /** Initialization method*/
    /*public void init() {
        loadProperties();
    }*/
}
