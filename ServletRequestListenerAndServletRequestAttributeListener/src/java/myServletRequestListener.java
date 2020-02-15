
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 *
 * @author vi5a7
 */
public class myServletRequestListener implements ServletRequestListener{
    static int count=0;
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Request Destroyed ...");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        count++;
        System.out.println("A new request reveived ... " + count);
    }
    
}
