package templatepattern;
public abstract class OrderList {
    
    void order(boolean meatBall, boolean papyaSalad, boolean vigor, boolean jinro){
        if(meatBall){
            meatBall();
        }
        if(papyaSalad){
            papayaSalad();
        }
        if(vigor){
            vigor();
        }
        if(jinro){
            jinro();
        }
    }
  
    abstract void meatBall();
    abstract void papayaSalad();
    abstract void vigor();
    abstract void jinro();
}
