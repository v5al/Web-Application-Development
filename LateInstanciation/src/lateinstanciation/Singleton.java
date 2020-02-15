
package lateinstanciation;
public class Singleton {
    private int id;
    private String name;
    private static Singleton s = null;
    private static Object lock = new Object();
    private static Object lock2 = new Object();
    private Singleton(){}
    public static Singleton getObj(){
        //create new object everytime
        //s = new Singleton()
        //show the same object
//        if(s==null){
//            s = new Singleton();
//        }
        synchronized (lock){
            if(s==null){
                s = new Singleton();
            }
        }
        synchronized (lock2){
            System.out.println("LOCK 2");
        }
        return s;
    }
    public void print(){
        System.out.println("id:"+id+" name:"+name);
    }
}
