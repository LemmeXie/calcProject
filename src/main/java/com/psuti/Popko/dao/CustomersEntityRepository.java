package com.psuti.Popko.dao;

import com.psuti.Popko.entities.CustomersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersEntityRepository extends JpaRepository<CustomersEntity, Integer> {
}