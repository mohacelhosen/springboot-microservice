package com.mohacel.customkeys.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Data
@NoArgsConstructor
@Entity
@Table(name = "EMPLOYEE_TAB")
public class EmployeeEntity {
    @Id
    @GenericGenerator(name = "emp_id_gen",
            strategy = "com.mohacel.customkeys.generator.EmpIdGenerator")
    @GeneratedValue(generator = "emp_id_gen")
    @Column(name = "EMP_ID_COL")
    private String empId;
    @Column(name = "EMP_NAME_COL")
    private String name;
    @Column(name = "EMP_AGE_COL")
    private Integer age;
    @Column(name = "EMP_GENDER_COL")
    private String gender;
    @Column(name = "EMP_COUNTRY_COL")
    private String country;

    public EmployeeEntity(String name, Integer age, String gender, String country) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.country = country;
    }
}
