import com.mcu.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Beans.xml");
        Car car = context.getBean("car", com.mcu.Car.class);
        car.drive();
    }
}
