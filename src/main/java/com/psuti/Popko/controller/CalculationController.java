package com.psuti.Popko.controller;


import com.psuti.Popko.dao.CalculationEntityRepository;
import com.psuti.Popko.entities.CalculationEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityExistsException;
import java.util.List;
import java.util.UUID;

@RequestMapping("/calc")
@RestController
public class CalculationController {
    private final CalculationEntityRepository CalcRepository;

    public CalculationController(CalculationEntityRepository CalcRepository) {
        this.CalcRepository=CalcRepository;
    }

    @GetMapping("/all")
public List<CalculationEntity> getAll(){return CalcRepository.findAll();}
//    @GetMapping("/reg")
//    public List<Cast> getAll(){return CastRepository.findAll();}
//    @GetMapping("/login")
//    public List<Cast> getAll(){return CastRepository.findAll();}
//    @GetMapping("/casts")
//    public List<Cast> getAll(){return CastRepository.findAll();}
//    @GetMapping("/casts")
//    public List<Cast> getAll(){return CastRepository.findAll();}
//    @GetMapping("/casts")
//    public List<Cast> getAll(){return CastRepository.findAll();}
//    @GetMapping("/casts")
//    public List<Cast> getAll(){return CastRepository.findAll();}
//    @GetMapping("/casts")
//    public List<Cast> getAll(){return CastRepository.findAll();}

//    @GetMapping("/{id}")
//    public Cast getById(@PathVariable("id") UUID id) {
//        return CastRepository.findById(id).get();
//    }
//    @GetMapping("/{name}")
//    public List<Cast> getByName(@PathVariable("name")String name)
//    {
//        return CastRepository.findByName(name);
//    }
//
//    @PostMapping
//    public Cast create(@RequestBody Cast cast) {
//        UUID id = cast.getId();
//        if (id != null) {
//            if (CastRepository.existsById(id)) {
//                throw new EntityExistsException("Cast already exists");
//            }
//        }
//        if (cast.getName().isEmpty()) {
//            throw new EntityExistsException("Name empty");
//        }
//        if (!UserRepository.findByFirstname(cast.user.getFirstname()).isEmpty()) {
//            userRestController.create(cast.user);
//        }
//        if (!FilmRepository.findByName(cast.film.getName()).isEmpty()) {
//            filmRestController.create(cast.film);
//        }
//        return CastRepository.save(cast);
//    }
//
//    @PutMapping
//    public Cast update(@RequestBody Cast cast) {
//        if (CastRepository.existsById(cast.getId())) {
//            return CastRepository.save(cast);
//        }
//        throw new EntityExistsException("Cast '" + cast.getName() + "' doesn't exists");
//    }
//
//    @DeleteMapping("/{id}")
//    public void remove(@PathVariable("id") UUID id) {
//        CastRepository.deleteById(id);
//    }
}
