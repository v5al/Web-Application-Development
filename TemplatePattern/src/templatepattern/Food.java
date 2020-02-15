package templatepattern;
public class Food extends OrderList {

    @Override
    void meatBall() {
        System.out.println("You order meatball...");
    }

    @Override
    void papayaSalad() {
        System.out.println("You order papaya Salad...");
    }

    @Override
    void vigor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void jinro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
