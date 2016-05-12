package com.nancyadam.ydbt.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nancyadam.ydbt.bookwormsEntities.BooksType;
import com.nancyadam.ydbt.bookwormsEntities.GoodreadsResponseType;
import com.nancyadam.ydbt.webservice.Bookworms;

import org.apache.log4j.Logger;
import org.xml.sax.SAXException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;



/**
 * Created by Nancy Adam on 5/6/2016.
 */

@WebServlet(
        name = "searchAuthor",
        urlPatterns = { "/searchAuthor" }
)

public class Search extends HttpServlet {
    private final Logger log = Logger.getLogger(this.getClass());

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ServletContext servletContext = getServletContext();
        HttpSession session = request.getSession();
        String addErrorMessage = "";

        String authorFirstName = request.getParameter("author_First_Name");
        String authorLastName = request.getParameter("author_Last_Name");

        if (authorFirstName.equals("") || (authorLastName.equals(""))){
            addErrorMessage = "Please try again!";
            session.setAttribute("addErrorMessage", addErrorMessage);
            String url = "/searchAuthor.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);
        }

        Bookworms bookworms = new Bookworms();

        String json = "";

        try {
            json = bookworms.getJSONBooksByAuthorName(authorFirstName, authorLastName);
        } catch (SAXException e) {
            log.error(e);
        }

        //Parse Json
        ObjectMapper objectMapper = new ObjectMapper();

        GoodreadsResponseType goodreads = objectMapper.readValue(json, GoodreadsResponseType.class);

        BooksType books = goodreads.getAuthor().getBooks();

        session.setAttribute("books", books);

        String url = "/viewBooks.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}

