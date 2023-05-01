package com.mohacel.entity;

import com.mohacel.customKey.EmpCompositeKey;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "EMPLOYEE_TAB")
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(EmpCompositeKey.class)
public class EmployeeEntity {
    @Id
    @Column(name = "EMP_ID_COL")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer empId;

    @Id
    @Column(name = "EMP_DEPT_ID_COL")
    @GenericGenerator(name = "emp_id_gen", strategy = "com.mohacel.customKey.DeptId")
    @GeneratedValue(generator = "emp_id_gen")

    private String deptId;

    @Column(name = "EMP_NAME_COL")
    private String name;
    @Column(name = "EMP_AGE_COL")
    private Integer age;
    @Column(name = "EMP_GENDER_COL")
    private String gender;
    @Column(name = "EMP_COUNTRY_COL")
    private String country;

    public EmployeeEntity( String name, Integer age, String gender, String country) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.country = country;
    }
}

