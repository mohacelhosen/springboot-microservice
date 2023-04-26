package UnAccess;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.mcu.component", "UnAccess"} )
public class Access {
    public static void main(String[] args) {
        SpringApplication.run(Access.class, args);
    }
}
