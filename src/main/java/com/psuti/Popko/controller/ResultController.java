package com.psuti.Popko.controller;

import com.psuti.Popko.entities.ResultsEntity;
import com.psuti.Popko.exceptions.NotFoundException;
import com.psuti.Popko.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("/result")
@RestController
public class ResultController { 
    @Autowired
    private ResultService resultService;

    public ResultController(ResultService resultService) {
        this.resultService = resultService;
    }

    @PostMapping
    public ResponseEntity addResult(@RequestBody ResultsEntity result) {
        try{
            resultService.createOrUpdateResult(result);
            return ResponseEntity.ok("Расчет сохранен успешно");
        } catch (Exception e){
            return ResponseEntity.badRequest().body("Успешно получена ошибка: "+result);
        }
    }
    @PutMapping
    public ResponseEntity editResult(@RequestBody ResultsEntity result) {
        try{
            resultService.createOrUpdateResult(result);
            return ResponseEntity.ok("Расчет изменен успешно");
        } catch (Exception e){
            return ResponseEntity.badRequest().body("Успешно получена ошибка: "+result);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity getResultById(@PathVariable Integer id){
        try{
            return ResponseEntity.ok(resultService.findResultById(id));
        }catch (NotFoundException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Успешно получена ошибка");
        }
    }

    @GetMapping("/all")
    public ResponseEntity getAll(){
        try{
            return ResponseEntity.ok(resultService.getAll());
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Успешно получена ошибка");
        }
    }

}
