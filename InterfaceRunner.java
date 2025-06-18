//  What is an Interface?
// An interface in Java is a blueprint of a class.
// It contains only method signatures (no body) — the classes that implement the interface must define the method bodies.

//  Think of an interface as a contract:

// "If a class uses this interface, it must provide its own version of all the methods."


interface RemoteControl{
    void turnOn();
    void turnOff();
}

//subclass thatt implement the interface
class TV implements RemoteControl{
    public void turnOn(){
        System.out.println("TV is turned ON");
    }
    public void turnOff(){
        System.out.println("TV is turned OFF");
    }
} 
class Fan implements RemoteControl {
    public void turnOn() {
        System.out.println("Fan is spinning");
    }

    public void turnOff() {
        System.out.println("Fan is stopped");
    }
}
public class InterfaceRunner {
    public static void main(String[] args) {
        
        RemoteControl device1 = new TV();
        RemoteControl device2 = new Fan();

        device1.turnOn();
        device1.turnOff();

        device2.turnOn();
        device2.turnOff();
    }
}
