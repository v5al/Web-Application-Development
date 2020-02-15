
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class myServletContextListener implements ServletContextListener, ServletContextAttributeListener{
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Context Initialized ... ");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Context Destroyed ...");
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println("New Attribute Added ...");
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println("Attribute Removed from the Context ...");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent arg0) {
        System.out.println("Attribute Replaced ...");
    }
    
}