package Payment;

public class PaymentReceiver {
    private Ipayment payment;
    // no args constructor
    public PaymentReceiver(){super();}
    // all args constructor
    public PaymentReceiver(Ipayment payment){this.payment=payment;}

    // setter method for instance variable(payment)
    public void setPayment(Ipayment payment){
        this.payment = payment;
    }
    //normal method
    public void pay(double amount){
        payment.pay(amount);
    }
}
