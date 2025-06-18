
//parant class
class Payment{
    public void makePayment(){ 
        System.out.println("making payment using a generic method..");

}
}

class CreditCardPayment extends Payment{
    @Override
    public void makePayment(){
        System.out.println("payment made using Credit Card");
    }
}
class PayPalPayment extends Payment {
    @Override
    public void makePayment() {
        System.out.println("Payment made using PayPal.");
    }
}

class CashPayment extends Payment {
    @Override
    public void makePayment() {
        System.out.println("Payment made using Cash.");
    }
}

public class PolyPaymentSystem {
public static void main(String[] args) {
     // Parent reference → Child objects
        Payment p1 = new CreditCardPayment();
        Payment p2 = new PayPalPayment();
        Payment p3 = new CashPayment();

        // Same method name, different behavior
        p1.makePayment();   // Credit Card
        p2.makePayment();   // PayPal
        p3.makePayment();   // Cash
}    

}
