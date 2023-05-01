package com.mohacel.repository;

import com.mohacel.customKey.EmpCompositeKey;
import com.mohacel.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, EmpCompositeKey> {

}
