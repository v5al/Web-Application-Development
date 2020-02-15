/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

public class ShortJump implements JumpBehavior{
    public void jump(){
        System.out.println("Short Jump");
    }
}
