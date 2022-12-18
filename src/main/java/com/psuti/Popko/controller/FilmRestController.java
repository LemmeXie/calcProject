package com.psuti.Popko.controller;

import com.psuti.Popko.dao.FilmRepository;
import com.psuti.Popko.entities.Film;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityExistsException;
import java.util.List;
import java.util.UUID;

@RequestMapping("/films")
@RestController
public class FilmRestController {
    private final FilmRepository filmRepository;
    public FilmRestController(FilmRepository filmRepository) {
        this.filmRepository=filmRepository;
    }

    @GetMapping("/films")
    public List<Film> getAll(){return filmRepository.findAll();}
//
//    @GetMapping("/{id}")
//    public Film getById(@PathVariable("id") UUID id) {
//        return filmRepository.findById(id).get();
//    }
    @GetMapping("/{name}")
    public List<Film> getByName(@PathVariable("name")String name)
    {
        return filmRepository.findByName(name);
    }

    @PostMapping
    public Film create(@RequestBody Film film) {
        UUID id = film.getId();
        if (id != null) {
            if (filmRepository.existsById(id)) {
                throw new EntityExistsException("Film already exists");
            }
        }
        return filmRepository.save(film);
    }

    @PutMapping
    public Film update(@RequestBody Film film) {
        if (filmRepository.existsById(film.getId())) {
            return filmRepository.save(film);
        }
        throw new EntityExistsException("Film '" + film.getName() + "' doesn't exists");
    }

    @DeleteMapping("/{id}")//name
    public void remove(@PathVariable("id") UUID id) {
        filmRepository.deleteById(id);
    }
}
