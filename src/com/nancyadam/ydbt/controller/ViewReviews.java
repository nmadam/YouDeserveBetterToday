package com.nancyadam.ydbt.controller;

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
        name = "viewReviews",
        urlPatterns = { "../viewReviews" }
)

public class ViewReviews extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


    }
}
