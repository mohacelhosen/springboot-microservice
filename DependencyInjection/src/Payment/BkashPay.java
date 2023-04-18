package Payment;

public class BkashPay implements Ipayment{
    @Override
    public void pay(double amount) {
        System.out.println("You paid "+ amount+ " successfully through Bkash Pay");
    }
}
