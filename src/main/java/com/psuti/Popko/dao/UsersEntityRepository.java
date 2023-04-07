package com.psuti.Popko.dao;

import com.psuti.Popko.entities.CustomersEntity;
import com.psuti.Popko.entities.UsersEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.security.core.userdetails.User;

import java.util.Optional;
import java.util.function.Function;

public interface UsersEntityRepository extends JpaRepository<UsersEntity, Integer> {
    <S extends CustomersEntity, R> R findByEmail(String email);
    User findUserByEmail(String email);
}