package com.psuti.Popko.controller;

import com.psuti.Popko.dao.RoleRepository;
import com.psuti.Popko.dao.UserRepository;
import com.psuti.Popko.entities.User;
import com.psuti.Popko.service.util.UserMeService;
import com.psuti.Popko.service.util.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityExistsException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("/users")
@RestController
public class UserRestController {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final UserService userService;

    @Autowired
    public UserRestController(UserRepository userRepository, RoleRepository roleRepository, UserService userService) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.userService = userService;
    }

//    @GetMapping("/users")
//    public List<User> getAll() {
//        return userRepository.findAll();
//    }

//    @GetMapping("/{id}")
//    public User getById(@PathVariable("id") UUID id) {
//        return userRepository.findById(id).get();
//    }

    @GetMapping("/{name}")
    public List<User> getByName(@PathVariable("name") String name) {
        return userRepository.findByFirstname(name);
    }
    // @PostMapping
//    public User create(@RequestBody User user) {
//        UUID id = user.getId();
//        if (id != null) {
//            if (userRepository.existsById(id)) {
//                throw new EntityExistsException("User already exists");
//            }
//        } else {
//            user.setId(UUID.randomUUID());
//        }
//        if (user.getRole().getId() == null) {
//            if ((user.getRole().getName() != null) && (roleRepository.findFirstByName(user.getRole().getName()) != null)) {
//
//                user.setRole(roleRepository.findFirstByName(user.getRole().getName()));
//            } else {
//                user.setRole(roleRepository.findFirstByName("peasant"));
//            }
//        }
//        return userRepository.save(user);
//    }

    @PutMapping
    public User update(@RequestBody User user) {
        if (userRepository.existsById(user.getId())) {
            return userRepository.save(user);
        }
        throw new EntityExistsException("User with id: '" + user.getId() + "' doesn't exists");
    }

    @DeleteMapping("/del/{name}")
    public void removeByName(@PathVariable("name") String name) {
        userRepository.delete(userRepository.findFirstByFirstname(name));
    }

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable("id") UUID id) {
        return userService.getById(id);
    }

    @PostMapping("/create")
    public User create(User user) {
        return userService.create(user);
    }

    @PutMapping("/update/{id}")
    public User update(User user, @PathVariable("id") UUID id) {
        return userService.update(user, id);
    }

    @DeleteMapping("/delete/{id}")
    public void remove(@PathVariable("id") UUID id) {
        userService.removeById(id);
    }
}
