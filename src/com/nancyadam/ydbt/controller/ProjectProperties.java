package com.nancyadam.ydbt.controller;

import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Properties;

@WebServlet(
        name = "projectProperties",
        urlPatterns = { "/projectProperties" }
)

/**
 * Created by Student on 5/11/2016.
 */
public class ProjectProperties extends HttpServlet {
    private final Logger log = Logger.getLogger(this.getClass());
    private Properties properties;

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

        /** holds properties information */
        properties = new Properties();

        request.setAttribute("properties", properties);
        String url = "/projectProperties";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

    /** Method that will load the project properties file into the Properties
     * instance variable.
     */
    private void loadProperties() {
        properties = new Properties();
        try {
            properties.load(this.getClass().getResourceAsStream("/Resources/properties"));
        } catch (IOException ioe) {
            log.error(ioe);
        } catch (Exception exception) {
            log.error(exception);
        }
    }

    /** Initialization method*/
    public void init() {
        loadProperties();
    }

}
