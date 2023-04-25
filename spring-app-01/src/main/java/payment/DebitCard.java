package payment;

public class DebitCard implements IPayment {

    public void pay(Double amount) {
        System.out.printf("%.2f tk Payment Successfully through  Debit Card ", amount);

    }
}
