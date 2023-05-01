package com.mohacel.customKey;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class EmpCompositeKey implements Serializable {
    private Integer empId;
    private String deptId;
}

