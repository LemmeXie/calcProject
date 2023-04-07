package com.psuti.Popko.dao;

import com.psuti.Popko.entities.CustomersEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.Optional;
import java.util.function.Function;

public interface CustomersEntityRepository extends JpaRepository<CustomersEntity, Integer> {
    <S extends CustomersEntity, R> R findByEmail(String email);
}