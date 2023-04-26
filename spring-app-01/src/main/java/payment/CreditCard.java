package payment;

public class CreditCard implements IPayment{
    public CreditCard() {
        System.out.println("CreditCard::Constructor");
    }

    public void pay(Double amount) {
        System.out.printf("%.2f tk Payment Successfully through  Credit Card ", amount);
    }
}
