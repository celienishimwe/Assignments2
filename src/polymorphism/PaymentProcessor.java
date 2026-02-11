package polymorphism;

public class PaymentProcessor {

    public void processPayment(CreditCard card) {
        System.out.println("Credit Card Payment");
    }

    public void processPayment(PayPal paypal) {
        System.out.println("PayPal Payment");
    }

    public void processPayment(Bitcoin bitcoin) {
        System.out.println("Bitcoin Payment");
        System.out.println("Transaction id:" + bitcoin.getTransactionId());
    }
}
