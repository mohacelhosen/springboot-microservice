package com.mohacel.transaction.repository;

import com.mohacel.transaction.entity.SourceAccount;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SourceRepository extends JpaRepository<SourceAccount, Integer> {
}