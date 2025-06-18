

// We want to create a payment system where:

// Different payment methods (PayPal, CreditCard, JazzCash) are available

// All payment types must follow the rules for processPayment() and generateReceipt()

// The main app only relies on the interface, so it can switch between payment types easily.

interface Payment{
    void processPayment(double amount);
    void generateReceipt();
}




class PayPalPayment implements Payment {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount + " for " + email);
    }

    public void generateReceipt() {
        System.out.println("PayPal receipt sent to " + email);
    }
}


class JazzCashPayment implements Payment {
    private String phoneNumber;

    public JazzCashPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void processPayment(double amount) {
        System.out.println("Sending payment of Rs. " + amount + " from JazzCash number " + phoneNumber);
    }

    public void generateReceipt() {
        System.out.println("JazzCash payment confirmation sent to " + phoneNumber);
    }
}

class CreditCardPayment implements Payment {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void processPayment(double amount) {
        System.out.println("Charging $" + amount + " to Credit Card ending with " + cardNumber.substring(cardNumber.length() - 4));
    }

    public void generateReceipt() {
        System.out.println("Credit Card receipt generated.");
    }
}



public class InterfaceOPS {
    //Online Payment System (PayPal, CreditCard, JazzCash)
     public static void main(String[] args) {
        Payment p1 = new PayPalPayment("user@example.com");
        Payment p2 = new CreditCardPayment("1234567890123456");
        Payment p3 = new JazzCashPayment("03001234567");

        // User chooses PayPal
        p1.processPayment(200.50);
        p1.generateReceipt();

        // User chooses Credit Card
        p2.processPayment(5000);
        p2.generateReceipt();

        // User chooses JazzCash
        p3.processPayment(750.75);
        p3.generateReceipt();
    }
}
