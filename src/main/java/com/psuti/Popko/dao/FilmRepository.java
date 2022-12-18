package com.psuti.Popko.dao;

import com.psuti.Popko.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface FilmRepository extends JpaRepository <Film, UUID> {
    List<Film> findByName(String name);
}