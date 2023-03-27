package com.controller;

import com.persistence.weatherDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        urlPatterns = {"/searchZip"}
)
public class ZipodeSearch extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        weatherDAO dao = new weatherDAO();

//        conditional for buttons
        if (req.getParameter("submit").equals("search")) {
            req.setAttribute("zipcode", dao.getCurrentWeather(Integer.parseInt(req.getParameter("zipcode"))));
        } else {
            req.setAttribute("zipcode", dao.getCurrentWeather(77340));
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/results.jsp");
        dispatcher.forward(req, resp);
    }
}