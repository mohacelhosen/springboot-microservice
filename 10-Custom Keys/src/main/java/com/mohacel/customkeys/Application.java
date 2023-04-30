package com.mohacel.customkeys;

import com.mohacel.customkeys.entity.EmployeeEntity;
import com.mohacel.customkeys.repository.IEmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        IEmployeeRepository employeeRepository = context.getBean(IEmployeeRepository.class);
        EmployeeEntity employee = new EmployeeEntity("Mohacel",23,"Male","Bangladesh");
        employeeRepository.save(employee);

        System.out.println("Record Inserted Successfully ✅");


    }

}
