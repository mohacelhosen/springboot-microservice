import Payment.BkashPay;
import Payment.CreditCard;
import Payment.DebitCard;
import Payment.PaymentReceiver;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception{
        // setter injection
        PaymentReceiver receiver = new PaymentReceiver();
        receiver.setPayment(new CreditCard());
        receiver.pay(200);

        // constructor injection
        PaymentReceiver nextReceiver = new PaymentReceiver(new DebitCard());
        nextReceiver.pay(450);

        // field injection
        BkashPay bkashPay = new BkashPay();

        Class<?> cls = Class.forName("Payment.PaymentReceiver");
        Field paymentField = cls.getDeclaredField("payment");
        paymentField.setAccessible(true);

        Object obj = cls.newInstance();
        PaymentReceiver paymentReceiver = (PaymentReceiver) obj;
        paymentField.set(obj, bkashPay);
        paymentReceiver.pay(300);


    }
}