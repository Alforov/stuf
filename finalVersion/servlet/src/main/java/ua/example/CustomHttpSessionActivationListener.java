package ua.example;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;
import java.util.logging.Logger;

/**
 * Created by mikhail_alferov on 31.07.2017.
 */
@WebListener
public class CustomHttpSessionActivationListener implements HttpSessionActivationListener {
    private Logger logger = Logger.getLogger(this.getClass().getName());

    @Override
    public void sessionWillPassivate(HttpSessionEvent se) {
        logger.info("sessionWillPassivate");
    }

    @Override
    public void sessionDidActivate(HttpSessionEvent se) {
        logger.info("sessionDidActivate");
    }
}
