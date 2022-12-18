package com.psuti.Popko.controller;

import com.psuti.Popko.dao.RoleRepository;
import com.psuti.Popko.entities.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityExistsException;
import java.util.List;
import java.util.UUID;

@RequestMapping("/roles")
@RestController
public class RoleRestController {
    private final RoleRepository roleRepository;

    @Autowired
    public RoleRestController(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @GetMapping
    public List<Role> getAll() {
        return roleRepository.findAll();
    }

//    @GetMapping("/{id}")
//    public Role getById(@PathVariable("id") UUID id) {
//        return roleRepository.findById(id).get();
//    }
    @GetMapping("/{name}")
    public List<Role> getByName(@PathVariable("name")String name)
{
    return roleRepository.findByName(name);
}


    @PostMapping
    public Role create(@RequestBody Role role) {
        UUID id = role.getId();
        if (id != null) {
            if (roleRepository.existsById(role.getId())) {
                throw new EntityExistsException("Role already exists");
            }
        }
        return roleRepository.save(role);
    }

    @PutMapping
    public Role update(@RequestBody Role role) {
        if (roleRepository.existsById(role.getId())) {
            return roleRepository.save(role);
        }
        throw new EntityExistsException("Role with id: '" + role.getId() + "' doesn't exists");
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id") UUID id) {
        roleRepository.deleteById(id);
    }

}
