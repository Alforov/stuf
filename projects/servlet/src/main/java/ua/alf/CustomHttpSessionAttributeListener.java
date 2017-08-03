package ua.alf;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.util.logging.Logger;

/**
 * Created by mikhail_alferov on 31.07.2017.
 */
@WebListener
public class CustomHttpSessionAttributeListener implements HttpSessionAttributeListener {
    Logger logger = Logger.getLogger(this.getClass().getName());
    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
      logger.info("attributeAdded");
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        logger.info("attributeRemoved");
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        logger.info("attributeReplaced");
    }
}
