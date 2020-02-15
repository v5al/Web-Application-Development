
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vi5a7
 */
public class myServletRequestAttributeListener implements ServletRequestAttributeListener{

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("Attribute added: "+ srae.getValue());
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println("Attribute removed: "+ srae.getValue());
    }
    
    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println("Attribute changed: "+ srae.getValue());
    }
}
