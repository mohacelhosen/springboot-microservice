package payment;

public class CreditCard implements IPayment{

    public void pay(Double amount) {
        System.out.printf("%.2f tk Payment Successfully through  Credit Card ", amount);
    }
}
