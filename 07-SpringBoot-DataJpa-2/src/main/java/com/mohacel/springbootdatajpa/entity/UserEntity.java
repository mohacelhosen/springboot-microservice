package com.mohacel.springbootdatajpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "USER_MASTER_TAB")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    @Id
    @Column(name = "USER_ID_COL")
    private Integer userId;
    @Column(name = "USER_NAME_COL")
    private String userName;
    @Column(name = "USER_GENDER_COL")
    private String gender;
    @Column(name = "USER_AGE_COL")
    private Integer age;
    @Column(name = "USER_COUNTRY_COL")
    private String country;
}
