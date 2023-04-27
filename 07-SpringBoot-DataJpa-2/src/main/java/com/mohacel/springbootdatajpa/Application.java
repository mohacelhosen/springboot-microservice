package com.mohacel.springbootdatajpa;

import com.mohacel.springbootdatajpa.entity.UserEntity;
import com.mohacel.springbootdatajpa.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);

        UserRepository userRepository = context.getBean(UserRepository.class);

//        <------------------ single record inserted --------------------->
//        UserEntity user1 = new UserEntity(1002,"Mohacel","Male",23,"Bangladesh");
//        userRepository.save(user1);
//

//        <------------------- multiple record inserted ----------------->
        List<UserEntity> userEntityList = new ArrayList<>();
        userEntityList.add(new UserEntity(1003,"Adi","Male",23,"Bangladesh"));
        userEntityList.add(new UserEntity(1004,"Reznu","Male",23,"Bangladesh"));
        userEntityList.add(new UserEntity(1005,"Asadu","Male",23,"Bangladesh"));
        userEntityList.add(new UserEntity(1011,"Megh","Female",14,"Bangladesh"));
        userEntityList.add(new UserEntity(1012,"Fahmida","Female",24,"Bangladesh"));
        userEntityList.add(new UserEntity(1013,"Aishah","Female",20,"Australia"));
        userEntityList.add(new UserEntity(1014,"ROC","Female",28,"Germany"));

        userRepository.saveAll(userEntityList);
        System.out.println("✅ Record Inserted Successfully into sbms database (USER_MASTER_TAB) ✅");

//        <-------------------  Find By ID  ----------------------->
        Optional<UserEntity > findById = userRepository.findById(1002);
        if(findById.isPresent()){
            System.out.println("✅ "+findById+" ✅");
        }else{
            System.out.println("ID Not Found ❌");
        }

//        <--------------------------  Find ALL By ID ------------------------------>
        Iterable<UserEntity> allById = userRepository.findAllById(Arrays.asList(1002, 1003, 1004));

        System.out.println("-----------------------------------------------------------------------");
        allById.forEach(i-> System.out.println(i));
        System.out.println("-----------------------------------------------------------------------");

//        <--------------------------  Find ALL ------------------------------>
        Iterable<UserEntity> allUser = userRepository.findAll();
        System.out.println("🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿");
        allUser.forEach(i-> System.out.println(i));
        System.out.println("🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿🌿");


//        <-------------------   Count  ------------------------>
        System.out.println("Total Record in the table:: "+userRepository.count());

//        <------------------  Is this ID Exist or Not   --------------------->
        System.out.println("1002 ID exist::"+userRepository.existsById(1002));

//        <-------------------   Delete By ID/Entity ------------------------------>
//        userRepository.deleteById(1006);
//        System.out.println("Deleted ID 1006 😵");

//        <-------------------------  Delete All ------------------->
//        userRepository.deleteAllById(Arrays.asList(1005,1006));
//        System.out.println("ID 1005 & 1006 Deleted Successfully✅");


    }

}
