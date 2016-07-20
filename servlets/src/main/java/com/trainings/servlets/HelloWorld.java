package com.trainings.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jlising on 2/23/16.
 */
@WebServlet(name = "HelloWorld", urlPatterns = {"/legacy/HelloWorld"})
public class HelloWorld extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String message = "Hello from Servlet";
        request.setAttribute("message", message);

        request.getRequestDispatcher("/WEB-INF/servlets/hello-world.jsp").forward(request, response);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
