package com.psuti.Popko.controller;

import com.psuti.Popko.entities.CustomersEntity;
import com.psuti.Popko.exceptions.AlreadyExistException;
import com.psuti.Popko.exceptions.NotFoundException;
import com.psuti.Popko.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("/cust")
@RestController
public class CustomerController {

    @Autowired
    private CustomersService customerService;

    @PostMapping
    public ResponseEntity addCustomer(@RequestBody CustomersEntity customer) {
        try{
            customerService.createCustomer(customer);
            return ResponseEntity.ok("Пользователь сохранен успешно");
        } catch (AlreadyExistException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Успешно получена ошибка: "+customer);
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity getCustomerById(@PathVariable Integer id){
        try{
            return ResponseEntity.ok(customerService.findCustomerById(id));
        }catch (NotFoundException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Успешно получена ошибка");
        }
    }

    @GetMapping("/all")
    public ResponseEntity getAll(){
        try{
            return ResponseEntity.ok(customerService.getAll());
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Успешно получена ошибка");
        }
    }

    @DeleteMapping("/del/{id}")
    public ResponseEntity deleteCustomerById(@PathVariable Integer id){
        try{
            return ResponseEntity.ok(customerService.deleteCustomerById(id));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Успешно получена ошибка");
        }
    }

}
