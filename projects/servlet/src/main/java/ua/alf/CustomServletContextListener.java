package ua.alf;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by mikhail_alferov on 01.08.2017.
 */
@WebListener
public class CustomServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
