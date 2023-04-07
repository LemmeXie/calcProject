package com.psuti.Popko.controller;

import com.psuti.Popko.entities.UsersEntity;
import com.psuti.Popko.exceptions.AlreadyExistException;
import com.psuti.Popko.exceptions.NotFoundException;
import com.psuti.Popko.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UsersService usersService;

    @PostMapping
    public ResponseEntity addUser(@RequestBody UsersEntity user) {
        try{
            usersService.createUser(user);
            return ResponseEntity.ok("Пользователь сохранен успешно");
        } catch (AlreadyExistException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Успешно получена ошибка: "+user);
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity getUserById(@PathVariable Integer id){
        try{
            return ResponseEntity.ok(usersService.findUserById(id));
        }catch (NotFoundException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Успешно получена ошибка");
        }
    }

    @GetMapping("/all")
    public ResponseEntity getAll(){
        try{
            return ResponseEntity.ok(usersService.getAll());
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Успешно получена ошибка");
        }
    }

    @DeleteMapping("/del/{id}")
    public ResponseEntity deleteUserById(@PathVariable Integer id){
        try{
            return ResponseEntity.ok(usersService.deleteUserById(id));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Успешно получена ошибка");
        }
    }

}

