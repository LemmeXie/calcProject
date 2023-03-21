package com.psuti.Popko.dao;

import com.psuti.Popko.entities.CalculationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalculationEntityRepository extends JpaRepository<CalculationEntity, Integer> {
}