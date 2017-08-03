package ua.alf;


import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.logging.Logger;

/**
 * Created by mikhail_alferov on 31.07.2017.
 */
@WebListener
public class SessionListener implements HttpSessionListener {
    Logger logger = Logger.getLogger(this.getClass().getName());

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        logger.info("test session created");

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        logger.info("test session destroyed");
    }
}
