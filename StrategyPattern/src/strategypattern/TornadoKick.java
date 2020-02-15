/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;
public class TornadoKick implements KickBehavior{

    @Override
    public void kick() {
        System.out.println("Tornado Kick");
    }
    
}
