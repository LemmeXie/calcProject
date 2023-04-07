package com.psuti.Popko.service;

import com.psuti.Popko.dao.CalculationEntityRepository;
import com.psuti.Popko.entities.CalculationEntity;
import com.psuti.Popko.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculationService {
    
    @Autowired
    CalculationEntityRepository repository;

    public CalculationEntity createCalc(CalculationEntity calc) {
        return repository.save(calc);
    }

    public CalculationEntity findCalcById(Integer id) throws NotFoundException {
        CalculationEntity calc = repository.findById(id).get();
        if(calc==null){
            throw new NotFoundException("Расчет не найден");
        }
        return calc;
    }

    public List<CalculationEntity> getAll() {
        return repository.findAll();
    }

}
