package com.mohacel.customkeys.repository;

import com.mohacel.customkeys.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepository extends JpaRepository<EmployeeEntity, String> {
}
