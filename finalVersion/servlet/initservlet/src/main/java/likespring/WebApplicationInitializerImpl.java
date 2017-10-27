package likespring;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created by mikhail_alferov on 27.10.2017.
 */
public class WebApplicationInitializerImpl implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.println("test");
    }
}
