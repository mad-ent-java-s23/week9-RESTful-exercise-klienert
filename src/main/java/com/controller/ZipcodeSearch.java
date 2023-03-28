package com.controller;

import com.persistence.weatherDAO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
public class ZipcodeSearch extends HttpServlet {
    private final Logger logger = LogManager.getLogger(this.getClass());
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        weatherDAO dao = new weatherDAO();
        if (req.getParameter("submit").equals("search")) {
            req.setAttribute("loc", dao.getCurrentWeather(Integer.parseInt(req.getParameter("zipcode"))).getLocation().getAllLocale());
            req.setAttribute("curr", dao.getCurrentWeather(Integer.parseInt(req.getParameter("zipcode"))).getCurrent().getAllCurrent());
            req.setAttribute("cond", dao.getCurrentWeather(Integer.parseInt(req.getParameter("zipcode"))).getCurrent().getCondition().getAllCondition());

            logger.info("    " + req.getParameter("zipcode") + " " + dao.getCurrentWeather(Integer.parseInt(req.getParameter("zipcode"))).getLocation().getName());
//        } else {
//            req.setAttribute("zip", dao.getCurrentWeather(77340).getCurrent().getTempF());
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/results.jsp");
        dispatcher.forward(req, resp);
    }
}