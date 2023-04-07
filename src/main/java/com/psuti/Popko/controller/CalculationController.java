package com.psuti.Popko.controller;

import com.psuti.Popko.dao.CalculationEntityRepository;
import com.psuti.Popko.entities.CalculationEntity;
import com.psuti.Popko.entities.UsersEntity;
import com.psuti.Popko.exceptions.AlreadyExistException;
import com.psuti.Popko.exceptions.NotFoundException;
import com.psuti.Popko.service.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("/calc")
@RestController
public class CalculationController {
    @Autowired
    private CalculationService calculationService;

    public CalculationController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @PostMapping
    public ResponseEntity addCalculation(@RequestBody CalculationEntity calculation) {
        try{
            calculationService.createCalc(calculation);
            return ResponseEntity.ok("Расчет сохранен успешно");
        } catch (Exception e){
            return ResponseEntity.badRequest().body("Успешно получена ошибка: "+calculation);
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity getCalculationById(@PathVariable Integer id){
        try{
            return ResponseEntity.ok(calculationService.findCalcById(id));
        }catch (NotFoundException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Успешно получена ошибка");
        }
    }
    @GetMapping("/all")
    public ResponseEntity getAll(){
        try{
            return ResponseEntity.ok(calculationService.getAll());
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Успешно получена ошибка");
        }
    }

}
