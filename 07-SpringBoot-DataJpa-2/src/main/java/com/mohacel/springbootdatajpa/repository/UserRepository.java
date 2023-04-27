package com.mohacel.springbootdatajpa.repository;

import com.mohacel.springbootdatajpa.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {
}
