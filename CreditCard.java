public class CreditCard{
  /*
  .
  .
  Rest of the card methods
  .
  .
  */
  public void Pay(String paymentType){
  Payment payment = PaymentProvider.getPayment(paymentType);
    payment.pay();
  }

}