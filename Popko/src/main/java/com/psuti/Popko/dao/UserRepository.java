package com.psuti.Popko.dao;

import com.psuti.Popko.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findUserByEmail(String email);
    List<User> findByFirstname(String firstname);
    User findFirstByFirstname(String firstname);
    void removeByEmail(String email);

}
