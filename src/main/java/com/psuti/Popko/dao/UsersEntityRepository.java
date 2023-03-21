package com.psuti.Popko.dao;

import com.psuti.Popko.entities.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersEntityRepository extends JpaRepository<UsersEntity, Integer> {
}