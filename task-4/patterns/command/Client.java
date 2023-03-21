package patterns.command;

import java.util.Scanner;

//Command interface
interface Command {
 public void execute();
}

//Concrete Command: Lights On
class LightsOnCommand implements Command {
 private LightReceiver receiver;

 public LightsOnCommand(LightReceiver receiver) {
     this.receiver = receiver;
 }

 public void execute() {
     receiver.turnOn();
 }
}

//Concrete Command: Lights Off
class LightsOffCommand implements Command {
 private LightReceiver receiver;

 public LightsOffCommand(LightReceiver receiver) {
     this.receiver = receiver;
 }

 public void execute() {
     receiver.turnOff();
 }
}

//Receiver class
class LightReceiver {
 public void turnOn() {
     System.out.println("Lights are on");
 }

 public void turnOff() {
     System.out.println("Lights are off");
 }
}

//Invoker class
class Switch {
 private Command onCommand;
 private Command offCommand;

 public Switch(Command onCommand, Command offCommand) {
     this.onCommand = onCommand;
     this.offCommand = offCommand;
 }

 public void flipUp() {
     onCommand.execute();
 }

 public void flipDown() {
     offCommand.execute();
 }
}

//Client code
public class Client {
 public static void main(String[] args) {
     LightReceiver receiver = new LightReceiver();
     Command lightsOn = new LightsOnCommand(receiver);
     Command lightsOff = new LightsOffCommand(receiver);

     Switch lightSwitch = new Switch(lightsOn, lightsOff);
     Scanner sc=new Scanner(System.in);
     String command=sc.nextLine();
     if(command.equals("on"))

     lightSwitch.flipUp(); // turns lights on
     else
     lightSwitch.flipDown(); // turns lights off
 }
}

