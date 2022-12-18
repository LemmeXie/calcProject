package com.psuti.Popko.dao;

import com.psuti.Popko.entities.Cast;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CastRepository extends JpaRepository <Cast, UUID> {
    List<Cast> findByName(String name);
}