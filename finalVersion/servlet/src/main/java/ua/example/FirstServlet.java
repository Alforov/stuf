package ua.example;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Created by mikhail_alferov on 31.07.2017.
 */
public class FirstServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setAttribute("atributeSession","44");
        resp.addCookie(new Cookie("cookie-test", "44"));
        Cookie[] cookies = req.getCookies();
        resp.getWriter().write("hello");
        //getServletContext().getContext("/examples").getNamedDispatcher("HelloWorldExample").forward(req, resp);
    }
}
