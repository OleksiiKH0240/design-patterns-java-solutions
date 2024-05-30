public class Customer {

  private PaymentStrategy paymentStrategy;

  public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }

  public void makePayment(int amount) {
    if (paymentStrategy != null) {
      paymentStrategy.makePayment(amount);
    } else {
      System.out.println("Please set payment strategy first.");
    }
  }

}
