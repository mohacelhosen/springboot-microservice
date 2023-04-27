package com.mohacel.datajpa.repository;

import com.mohacel.datajpa.entity.PlayersEntity;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<PlayersEntity, Integer> {
}
