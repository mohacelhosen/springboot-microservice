package com.mohacel.transaction.repository;

import com.mohacel.transaction.entity.DestinationAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinationRepository extends JpaRepository<DestinationAccount, Integer> {
}
