package Payment;

public class DebitCard implements Ipayment{
    @Override
    public void pay(double amount) {
        System.out.println("You paid "+ amount+ " successfully through Debit card");
    }
}
