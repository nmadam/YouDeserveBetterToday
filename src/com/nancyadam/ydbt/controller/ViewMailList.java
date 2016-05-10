package com.nancyadam.ydbt.controller;

import com.nancyadam.ydbt.entity.User;
import com.nancyadam.ydbt.persistence.UserDaoWithHibernate;

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
 * Created by Student on 5/6/2016.
 */

@WebServlet(
        name = "viewMailingList",
        urlPatterns = { "/viewMailingList" }
)

public class ViewMailList extends HttpServlet {

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
