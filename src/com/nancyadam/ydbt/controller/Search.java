package com.nancyadam.ydbt.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nancyadam.ydbt.webservice.Bookworms;
import org.xml.sax.SAXException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Nancy Adam on 5/6/2016.
 */

@WebServlet(
        name = "searchAuthor",
        urlPatterns = { "/searchAuthor" }
)

public class Search extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Bookworms bookworms = new Bookworms();

        String json = "";

        try {
            json = bookworms.getJSONBooksByAuthorName("Sarah", "Maas");
        } catch (SAXException e) {
            e.printStackTrace();
        }

        //Parse Json
        ObjectMapper objectMapper = new ObjectMapper();



        String url = "/viewBooks.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}

