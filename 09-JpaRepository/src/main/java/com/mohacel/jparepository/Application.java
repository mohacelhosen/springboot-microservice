package com.mohacel.jparepository;

import com.mohacel.jparepository.entity.ClubMemberEntity;
import com.mohacel.jparepository.repository.IMemberRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        IMemberRepository memberRepository = context.getBean(IMemberRepository.class);

//        ClubMemberEntity member1 = new ClubMemberEntity("Mohacel",23,"Male");
//        ClubMemberEntity member2 = new ClubMemberEntity("Walida", 15,"Female");
//        ClubMemberEntity member3 = new ClubMemberEntity("Aisha", 21,"Female");
//        ClubMemberEntity member4 = new ClubMemberEntity("Krystal", 27,"Female");
//        ClubMemberEntity member5 = new ClubMemberEntity("Tushar", 19,"Male");
//        ClubMemberEntity member6 = new ClubMemberEntity("Adi", 23,"Male");
//        ClubMemberEntity member7 = new ClubMemberEntity("Asadu", 23,"Male");
//        ClubMemberEntity member8 = new ClubMemberEntity("Reznu", 23,"Male");
//        ClubMemberEntity member9 = new ClubMemberEntity("Rayhan", 24,"Male");
//        ClubMemberEntity member10 = new ClubMemberEntity("Takumi", 20,"Male");
//        memberRepository.saveAll(Arrays.asList(member1,member2,member3,member4,member5,member6,member7,member8,member9,member10));


//        <----------------------------------------- Sorting  -------------------------------------------------->

//        System.out.println("-------------------------------  Sorting by single properties  ----------------------------------------------");
//        List<ClubMemberEntity> membersList1 = memberRepository.findAll(Sort.by("memberId").descending());
//        membersList1.forEach(i-> System.out.println(i));
//        System.out.println("-----------------------------------------------------------------------------");
//
//        System.out.println("---------------------------------  Sorting by Multiple properties  --------------------------------------------");
//        List<ClubMemberEntity> membersList2 = memberRepository.findAll(Sort.by("name").ascending().and(Sort.by("age").ascending()));
//        membersList1.forEach(i-> System.out.println(i));
//        System.out.println("-----------------------------------------------------------------------------");



//        <-----------------------------   pagination    --------------------------------------------->
//        int pageNumber = 0;
//        int sizePerPage = 4;
//        System.out.println("------------------------------  Pagination  -----------------------------------------------");
//        Page<ClubMemberEntity> all = memberRepository.findAll(PageRequest.of(pageNumber, sizePerPage));
//        all.forEach(i-> System.out.println(i));
//        System.out.println("-----------------------------------------------------------------------------");
//        System.out.println("Total Page Number:: "+all.getTotalPages());



//        <---------------------------------Query By Example ----------------------------------------->

//        ClubMemberEntity memberEntity = new ClubMemberEntity();
//        memberEntity.setGender("Male");
//        memberEntity.setAge(23);
//
//        Example<ClubMemberEntity> example = Example.of(memberEntity);
//        List<ClubMemberEntity> allMembers = memberRepository.findAll(example);
//        System.out.println("----------------------------------- Query By Example -----------------------------------------");
//        allMembers.forEach(i-> System.out.println(i));
//        System.out.println("----------------------------------------------------------------------------");


//        <------------------------ Example and Sort ----------------------------------->
        ClubMemberEntity memberEntity = new ClubMemberEntity();
        memberEntity.setGender("Male");
        System.out.println("---------------------------------  Example and  Sort-------------------------------------------");
        List<ClubMemberEntity> allMembers = memberRepository.findAll(Example.of(memberEntity), Sort.by("name").descending());
        allMembers.forEach(i-> System.out.println(i));
        System.out.println("----------------------------------------------------------------------------");


        System.out.println("---------------------------------- Example and Page ------------------------------------------");
        Page<ClubMemberEntity> memberEntities = memberRepository.findAll(Example.of(memberEntity), PageRequest.of(1, 5));
        memberEntities.forEach(i-> System.out.println(i));
        System.out.println("----------------------------------------------------------------------------");


    }

}


