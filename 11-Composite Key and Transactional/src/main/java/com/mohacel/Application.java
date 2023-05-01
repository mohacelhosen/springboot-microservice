package com.mohacel;

import com.mohacel.entity.EmployeeEntity;
import com.mohacel.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);

        EmployeeRepository repository = context.getBean(EmployeeRepository.class);

        EmployeeEntity employee = new EmployeeEntity("Mohacel",23,"Male", "Bangladesh");
        repository.save(employee);
        System.out.println("Record Inserted successfully ✅");


    }

}
