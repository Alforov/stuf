package ua.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by mikhail_alferov on 31.07.2017.
 */
public class FirstServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = this.getServletContext();
        RequestDispatcher secondServlet = servletContext.getNamedDispatcher("secondServlet");
        secondServlet.forward(req,resp);
        ServletConfig servletConfig = this.getServletConfig();
        servletContext.setAttribute("from first", "33");
        resp.getWriter().write("test");
    }
}
