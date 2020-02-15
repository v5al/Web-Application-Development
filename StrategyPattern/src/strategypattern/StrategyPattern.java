
package strategypattern;

public class StrategyPattern {

    public static void main(String[] args) {
        JumpBehavior longJump = new LongJump();
        JumpBehavior shortJump = new ShortJump();
        KickBehavior tornadoKick = new TornadoKick();
        
        Fighter ken = new Ken(tornadoKick, shortJump);
        ken.display();
        ken.jump();
        ken.kick();
        
        ken.setJumpBehavior(longJump);
        ken.jump();
    }
    
}
