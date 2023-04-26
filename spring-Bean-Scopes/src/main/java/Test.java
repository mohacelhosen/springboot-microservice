import com.mcu.Motor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Beans.xml");
        Motor motor1 = context.getBean("motor", com.mcu.Motor.class);
        Motor motor2 =context.getBean("motor", com.mcu.Motor.class);

        System.out.println("Motor object_1 = "+motor1);
        System.out.println("Motor object_2 = "+motor2);
        System.out.println("Both are same object:: "+ (motor1==motor2) );
    }
}
