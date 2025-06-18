//abstract class
abstract class Rider{
    //abstract method
    public abstract void deliverOrder();

    public void checkStatus(){
        System.out.println("checking delivery status...");
    }
}

//concrete classes(subclasses)
class BikeRider extends Rider{
    @Override
    public void deliverOrder(){
        System.out.println("Delivering order using a bike..");
    }
}

class CarRider extends Rider {
    @Override
    public void deliverOrder() {
        System.out.println("Delivering order using a car...");
    }
}

class CycleRider extends Rider{
    @Override
    public void deliverOrder(){
        System.out.println("Delivering order using a bikcycle...");
    }
}
public class AbstractOFDApp {
    //Online Food Delivery App
    public static void main(String[] args) {
        Rider r1 = new BikeRider();
        Rider r2 = new CycleRider();
        Rider r3 = new CarRider();

        r1.deliverOrder();
        r2.deliverOrder();
        r3.deliverOrder();

        r1.checkStatus();
    }
}
