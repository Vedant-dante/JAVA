package Assignment10;

abstract class Payment {

    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract void makePayment();

    void displayAmount() {
        System.out.println("Payment Amount: " + amount);
    }
}

class CreditCardPayment extends Payment {

    CreditCardPayment(double amount) {
        super(amount);
    }

    void makePayment() {
        System.out.println("Payment made using Credit Card");
    }
}

class UPIPayment extends Payment {

    UPIPayment(double amount) {
        super(amount);
    }

    void makePayment() {
        System.out.println("Payment made using UPI");
    }
}

public class PaymentApp {

    public static void main(String[] args) {

        Payment creditCard = new CreditCardPayment(5000);

        System.out.println("Credit Card Payment");
        creditCard.displayAmount();
        creditCard.makePayment();

        System.out.println();

        Payment upi = new UPIPayment(2500);

        System.out.println("UPI Payment");
        upi.displayAmount();
        upi.makePayment();
    }
}