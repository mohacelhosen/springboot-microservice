package com.mohacel.img;

import com.mohacel.img.entity.UserEntity;
import com.mohacel.img.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application  {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = SpringApplication.run(Application.class, args);

        UserService service = context.getBean(UserService.class);
        service.save();


    }

}
