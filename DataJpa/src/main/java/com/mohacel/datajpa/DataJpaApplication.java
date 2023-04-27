package com.mohacel.datajpa;

import com.mohacel.datajpa.entity.PlayersEntity;
import com.mohacel.datajpa.repository.PlayerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DataJpaApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DataJpaApplication.class, args);

        PlayerRepository playerRepository = context.getBean(PlayerRepository.class);
        System.out.println(playerRepository.getClass().getName());
        System.out.println(context.getBeanDefinitionCount());

        PlayersEntity p1 = new PlayersEntity();
        p1.setPlayerId(101);
        p1.setPlayerName("Mohacel");
        p1.setPlayerAge(23);
        p1.setLocation("Bangladesh");

        playerRepository.save(p1);
        System.out.println("Record Inserted ✅");


    }

}
