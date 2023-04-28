package com.mcu;

import com.mcu.entity.UserEntity;
import com.mcu.repository.IUserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        ApplicationContext Context = SpringApplication.run(Application.class, args);

        // get the bean
        IUserRepository userRepository = Context.getBean(IUserRepository.class);

//        // creat a list of user
//        List<UserEntity> userList = new ArrayList<>();
//        userList.add(new UserEntity(1002,"Mohacel",23,"Male","Bangladesh"));
//        userList.add(new UserEntity(1003,"Adi",23,"Male","Bangladesh"));
//        userList.add(new UserEntity(1004,"Vera",26,"Female","Philippine"));
//        userList.add(new UserEntity(1005,"Krystal",24,"Female","America"));
//        userList.add(new UserEntity(1006,"Megh",14,"Female","Bangladesh"));
//        userList.add(new UserEntity(1007,"Walida",15,"Female","Bangladesh"));
//
//        // add all user
//        userRepository.saveAll(userList);

//        <-------------------------- retrieve data using country ----------------------------------->
//        List<UserEntity> byCountry = userRepository.findByCountry("Bangladesh");
//        System.out.println("---------------------------------------------------------------------------------");
//        byCountry.forEach(i-> System.out.println(i));
//        System.out.println("---------------------------------------------------------------------------------");


//        <-------------------------- retrieve data using age ----------------------------------->
//        List<UserEntity> byAge = userRepository.findByAge(23);
//        System.out.println("---------------------------------------------------------------------------------");
//        byAge.forEach(i-> System.out.println(i));
//        System.out.println("---------------------------------------------------------------------------------");

//        <-------------------------- retrieve data using age>=  ----------------------------------->
//        List<UserEntity> byAgeIsGreaterThanEqual = userRepository.findByAgeIsGreaterThanEqual(23);
//        System.out.println("---------------------------------------------------------------------------------");
//        byAgeIsGreaterThanEqual.forEach(i-> System.out.println(i));
//        System.out.println("---------------------------------------------------------------------------------");

//        <-------------------------- retrieve data using "multiple country"   ----------------------------------->
//        List<UserEntity> byCountries = userRepository.findByCountryIn(Arrays.asList("Bangladesh", "America"));
//        System.out.println("---------------------------------------------------------------------------------");
//        byCountries.forEach(i-> System.out.println(i));
//        System.out.println("---------------------------------------------------------------------------------");

//        <-------------------------- retrieve data using  "country and age"  ----------------------------------->
//        List<UserEntity> byCountryAndAge = userRepository.findByCountryAndAgeIsLessThan("Bangladesh", 20);
//        System.out.println("---------------------------------------------------------------------------------");
//        byCountryAndAge.forEach(i-> System.out.println(i));
//        System.out.println("---------------------------------------------------------------------------------");

//        <-------------------------- retrieve data using  "country and age and gender"  ----------------------------------->
//        List<UserEntity> byCountryAndAgeAndGender = userRepository.findByCountryAndAgeIsGreaterThanAndGender("America",20,"Female");
//        System.out.println("---------------------------------------------------------------------------------");
//        byCountryAndAgeAndGender.forEach(i-> System.out.println(i));
//        System.out.println("---------------------------------------------------------------------------------");

        // custom queries "HQL"
        System.out.println("--------------------------------------  HQL   --------------------------------------");
        List<UserEntity> userList1 = userRepository.getAllUserHql();
        userList1.forEach(i-> System.out.println(i));
        System.out.println("---------------------------------------------------------------------------------");

        // custom queries "SQL"
        System.out.println("------------------------------- SQL  ---------------------------------------");
        List<UserEntity> userList2 = userRepository.getAllUserSql();
        userList2.forEach(i-> System.out.println(i));
        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("------------------------------- HQL using country and age  ---------------------------------------");
        List<UserEntity> allUserByCountryAndGender = userRepository.getAllUserByCountryAndGenderHql("Bangladesh", "Male");
        allUserByCountryAndGender.forEach(i-> System.out.println(i));
        System.out.println("---------------------------------------------------------------------------------");


    }
}


