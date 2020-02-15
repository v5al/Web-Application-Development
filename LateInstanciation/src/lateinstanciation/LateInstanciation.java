
package lateinstanciation;

public class LateInstanciation {
    static Singleton s = null ;
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                s = Singleton.getObj();
                System.out.println(s);
            }
        });
        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() {
                s = Singleton.getObj();
                System.out.println(s);
            }
        });
        t1.start();
        t2.start();
    }
}
