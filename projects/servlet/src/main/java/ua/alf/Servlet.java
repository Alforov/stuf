package ua.alf;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import javax.servlet.annotation.WebInitParam;
/**
 * Created by mikhail_alferov on 31.07.2017.
 */
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //  req.getSession();
        HttpSession session = req.getSession();
        /*while (session.getAttributeNames().hasMoreElements()){
            log(session.getAttributeNames().nextElement());
        }*/

        boolean b = 1==1 && 2==2;
        System.out.println(b);
     /*   session.setAttribute("testAttr", "88");
        resp.addHeader("Location","http://korrespondent.net");
        resp.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);*/
        resp.getOutputStream().write("test".getBytes());
    }
}
