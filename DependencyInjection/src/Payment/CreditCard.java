package Payment;

public class CreditCard implements Ipayment{

    @Override
    public void pay(double amount) {
        System.out.println("You paid "+ amount+ " successfully through Credit card");
    }
}
