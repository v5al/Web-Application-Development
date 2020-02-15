package templatepattern;
public class Drink extends OrderList {

    @Override
    void meatBall() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void papayaSalad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void vigor() {
        System.out.println("You order Vigor..");
    }

    @Override
    void jinro() {
        System.out.println("You order Jinro..");
    }
}
