package com.psuti.Popko.dao;

import com.psuti.Popko.entities.UserStatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserStatusEntityRepository extends JpaRepository<UserStatusEntity, Integer> {
}