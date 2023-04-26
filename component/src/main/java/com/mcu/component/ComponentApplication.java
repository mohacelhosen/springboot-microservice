package com.mcu.component;

import com.mcu.component.firewall.Security;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ComponentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComponentApplication.class, args);
    }

}
