package com.mcu.repository;

import com.mcu.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Arrays;
import java.util.List;

public interface IUserRepository extends CrudRepository<UserEntity, Integer> {

//    //***
//
//    //mysql> select * from mcu_user_tab where user_country_col='Bangladesh';
//    List<UserEntity> findByCountry(String country);
//
//    //mysql> select * from mcu_user_tab where user_age_col = 23;
//    List<UserEntity> findByAge(Integer age);
//
//    //mysql> select * from mcu_user_tab where user_age_col >=23;
//    List<UserEntity> findByAgeIsGreaterThanEqual(Integer age);
//
//    //mysql> select * from mcu_user_tab where user_country_col in ('Bangladesh', 'America');
//    List<UserEntity> findByCountryIn(List<String> country);
//
//    //select * from mcu_user_tab where user_country_col='Bangladesh' and user_age_col<20;
//    List<UserEntity> findByCountryAndAgeIsLessThan(String country, Integer age);
//
//    //mysql> select * from mcu_user_tab where user_country_col='America' and user_age_col>20 and user_gender_col='Female';
//    List<UserEntity> findByCountryAndAgeIsGreaterThanAndGender(String country, Integer age, String gender);
//
////*******

//    <--------------------------------------- Custom queries    -------------------------------------------------------->
    @Query(value = "from UserEntity ")
    List<UserEntity> getAllUserHql();

    @Query(value = "from UserEntity where country=:userCountry and gender=:userGender")
    List<UserEntity> getAllUserByCountryAndGenderHql(String userCountry, String userGender);

    @Query(value = "select * from MCU_USER_TAB", nativeQuery = true)
    List<UserEntity> getAllUserSql();

}

