package com.mohacel.jparepository.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@Entity
@Table(name = "CLUB_MEMBER_TAB")
public class ClubMemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MEMBER_ID_COL")
    private Integer memberId;
    @Column(name = "MEMBER_NAME_COL")
    private String name;
    @Column(name = "MEMBER_AGE_COL")
    private Integer age;
    @Column(name = "MEMBER_GENDER_COL")
    private String gender;

    @CreationTimestamp
    @Column(name = "JOINING_DATE_COL", updatable = false)
    private LocalDate joiningDate;

    @UpdateTimestamp
    @Column(name = "UPDATE_DATE_COL", insertable = false)
    private LocalDate updatedDate;

    public ClubMemberEntity(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
