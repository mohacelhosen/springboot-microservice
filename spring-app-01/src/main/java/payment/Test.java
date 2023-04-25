package payment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
    public static void main(String[] args) throws Exception {

        // it will read our xml file and start IOC container and IOC container will perform dependency injection
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Beans.xml");

        PaymentReceiver receiver = context.getBean("paymentReceiver", PaymentReceiver.class);
        receiver.collectPayment(400.0);

    }
}
