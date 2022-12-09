package com.psuti.Popko.dao;

import com.psuti.Popko.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ActorRepository extends JpaRepository <Actor, UUID> {
    List<Actor> findByName(String name);
}