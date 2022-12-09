package com.psuti.Popko.dao;

import com.psuti.Popko.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;
public interface UserRepository extends JpaRepository<User, UUID> {
    List<User> findByFirstname(String firstname);
    User findFirstByFirstname(String firstname);
}
