public class CreditCard{
  /*
  .
  .
  Rest of the card methods
  .
  .
  */

  // we achioeve here total abstraction of payment option fopr credit card class
  @override
  public void Pay(String paymentType){
  Payment payment =         PaymentProvider.getPayment(paymentType);
    payment.pay();
  }

}