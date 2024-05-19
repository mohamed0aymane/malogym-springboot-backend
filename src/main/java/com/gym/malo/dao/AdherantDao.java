package com.gym.malo.dao;

import com.gym.malo.entity.Adherant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdherantDao extends CrudRepository<Adherant,Integer> {
}
