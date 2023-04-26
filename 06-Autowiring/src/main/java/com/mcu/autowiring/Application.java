package com.mcu.autowiring;

import com.mcu.autowiring.robot.ZeroTwo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        ZeroTwo ai = context.getBean(ZeroTwo.class);
        ai.Status();
    }

}
