package com.psuti.Popko.dao;

import com.psuti.Popko.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface RoleRepository extends JpaRepository <Role, UUID> {
    List<Role> findByName(String name);
    Role findFirstByName(String name);
}