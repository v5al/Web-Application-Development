
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MySessionAttributeListener implements HttpSessionAttributeListener{

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        System.out.println("New Attribute Added:"+ event.getValue()); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        System.out.println("Attribute Replaced:"+ event.getValue());//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        System.out.println("Attribute Changed:"+event.getValue()); //To change body of generated methods, choose Tools | Templates.
    }
    
}
