
package commandpattern;

public class CommandPattern {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        Stereo stereo = new Stereo();
        
        remote.setCommand(new LightOnCommand(light));
        remote.buttonWasPressed();
        
        remote.setCommand(new StereoOnWithCDCommand(stereo));
        remote.buttonWasPressed();
    }
    
}
