
package commandpattern;

public class SimpleRemoteControl {
    Command slot;
    
    public void setCommand(Command command){this.slot = command;}
    public void buttonWasPressed(){slot.execute();}
}
