public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();

        // Встановлюємо стратегію оплати через банківський рахунок
        customer.setPaymentStrategy(new BankAccountPaymentStrategy());
        customer.makePayment(100);

        // Встановлюємо стратегію оплати через PayPal
        customer.setPaymentStrategy(new PayPalPaymentStrategy());
        customer.makePayment(50);
    }
}
