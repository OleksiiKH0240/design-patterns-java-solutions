public class BankAccountPaymentStrategy implements PaymentStrategy {
    @Override
    public void makePayment(int amount) {
        System.out.println("Payment of $" + amount + " made from bank account.");
    }
}