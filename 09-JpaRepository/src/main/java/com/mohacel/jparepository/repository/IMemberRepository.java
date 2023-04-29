package com.mohacel.jparepository.repository;

import com.mohacel.jparepository.entity.ClubMemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMemberRepository extends JpaRepository<ClubMemberEntity, Integer> {
}
