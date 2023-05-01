package com.mohacel.img.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "USER_TABLE")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;
    private String email;
    private String name;
    private Integer age;
    private String gender;
    @Lob
    private byte[] image;

    public UserEntity(String email, String name, Integer age, String gender) {
        this.email = email;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
