package payment;

public class BKash implements IPayment {
    public BKash() {
        System.out.println("BKash::Constructor");
    }

    public void pay(Double amount) {
        System.out.printf("%.2f tk Payment Successfully through  BKash ", amount);

    }
}
