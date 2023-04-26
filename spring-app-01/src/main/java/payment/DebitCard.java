package payment;

public class DebitCard implements IPayment {
    public DebitCard() {
        System.out.println("DebitCard::Constructor");
    }

    public void pay(Double amount) {
        System.out.printf("%.2f tk Payment Successfully through  Debit Card ", amount);

    }
}
