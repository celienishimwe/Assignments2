package polymorphism;

public class main {
    public static void main(String[] args) {

        PaymentProcessor processor = new PaymentProcessor();

        CreditCard creditCard = new CreditCard();
        PayPal paypal = new PayPal();
        Bitcoin bitcoin = new Bitcoin("1234567890");

        System.out.println("payment with Credit Card:");
        processor.processPayment(creditCard);

        System.out.println("payment with PayPal:");
        processor.processPayment(paypal);

        System.out.println("payment with Bitcoin:");
        processor.processPayment(bitcoin);
    }
}
