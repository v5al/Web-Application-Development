
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class myHttpSessionListener implements HttpSessionListener{
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("New Session Created...");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("Session Destroyed...");
    }
}
