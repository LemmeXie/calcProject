package com.psuti.Popko.controller;

import com.psuti.Popko.dao.RoleRepository;
import com.psuti.Popko.dao.UserRepository;
import com.psuti.Popko.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityExistsException;
import java.util.List;
import java.util.UUID;

@RequestMapping("/users")
@RestController
public class UserRestController {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Autowired
    public UserRestController(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @GetMapping("/users")
    public List<User> getAll() {
        return userRepository.findAll();
    }

//    @GetMapping("/{id}")
//    public User getById(@PathVariable("id") UUID id) {
//        return userRepository.findById(id).get();
//    }

    @GetMapping("/{name}")
    public List<User> getByName(@PathVariable("name")String name)
    {
        return userRepository.findByFirstname(name);
    }

    @PostMapping
    public User create(@RequestBody User user) {
        UUID id = user.getId();
        if (id != null) {
            if (userRepository.existsById(id)) {
                throw new EntityExistsException("User already exists");
            }
        } else {
            user.setId(UUID.randomUUID());
        }
        if (user.getRole().getId() == null) {
            if ((user.getRole().getName() != null) && (roleRepository.findFirstByName(user.getRole().getName()) != null)) {

                user.setRole(roleRepository.findFirstByName(user.getRole().getName()));
            } else {
                user.setRole(roleRepository.findFirstByName("peasant"));
            }
        }
        return userRepository.save(user);
    }

    @PutMapping
    public User update(@RequestBody User user) {
        if (userRepository.existsById(user.getId())) {
            return userRepository.save(user);
        }
        throw new EntityExistsException("User with id: '" + user.getId() + "' doesn't exists");
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable("id") UUID id) {
        userRepository.deleteById(id);
    }
    @DeleteMapping("/del/{name}")
    public void removeByName(@PathVariable("name") String name) {
        userRepository.delete(userRepository.findFirstByFirstname(name));
    }
}
