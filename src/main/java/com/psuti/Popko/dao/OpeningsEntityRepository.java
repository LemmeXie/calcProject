package com.psuti.Popko.dao;

import com.psuti.Popko.entities.OpeningsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OpeningsEntityRepository extends JpaRepository<OpeningsEntity, Integer> {
}