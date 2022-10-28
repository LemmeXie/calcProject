package com.psuti.Popko.dao;

import com.psuti.Popko.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository <Role, String> {
}