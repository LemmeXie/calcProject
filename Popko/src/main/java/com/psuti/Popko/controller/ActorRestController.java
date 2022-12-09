package com.psuti.Popko.controller;

import com.psuti.Popko.dao.ActorRepository;
import com.psuti.Popko.entities.Actor;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityExistsException;
import java.util.List;
import java.util.UUID;

@RequestMapping("/actors")
@RestController
public class ActorRestController {
    private final ActorRepository ActorRepository;
    public ActorRestController(ActorRepository ActorRepository) {
        this.ActorRepository=ActorRepository;
    }

    @GetMapping("/actors")
    public List<Actor> getAll(){return ActorRepository.findAll();}

//    @GetMapping("/{id}")
//    public Actor getById(@PathVariable("id") UUID id) {
//        return ActorRepository.findById(id).get();
//    }
    @GetMapping("/{name}")
    public List<Actor> getByName(@PathVariable("name")String name)
    {
        return ActorRepository.findByName(name);
    }

    @PostMapping
    public Actor create(@RequestBody Actor actor) {
        UUID id = actor.getId();
        if (id != null) {
            if (ActorRepository.existsById(id)) {
                throw new EntityExistsException("Actor already exists");
            }
        }
        return ActorRepository.save(actor);
    }

    @PutMapping
    public Actor update(@RequestBody Actor actor) {
        if (ActorRepository.existsById(actor.getId())) {
            return ActorRepository.save(actor);
        }
        throw new EntityExistsException("Actor '" + actor.getName() + "' doesn't exists");
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id") UUID id) {
        ActorRepository.deleteById(id);
    }
}
