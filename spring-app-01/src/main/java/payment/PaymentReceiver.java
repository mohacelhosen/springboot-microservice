package payment;
public class PaymentReceiver {
    private IPayment payment;
    public void setPayment(IPayment payment) {
        this.payment = payment;
        System.out.println("Setter::Injection");
    }
    public PaymentReceiver (){
        System.out.println("No-args:: PaymentReceiver Constructor");
    }
    public PaymentReceiver(IPayment payment) {
        this.payment = payment;
        System.out.println("Args:: PaymentReceiver Constructor");
    }
    public void collectPayment(Double amount){
        payment.pay(amount);
        System.out.println("\nThank you from payment receiver 😇");
    }
}
