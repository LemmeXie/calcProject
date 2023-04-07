package com.psuti.Popko.service;

import com.psuti.Popko.dao.ResultsEntityRepository;
import com.psuti.Popko.entities.ResultsEntity;
import com.psuti.Popko.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultService {
    
    @Autowired
    ResultsEntityRepository repository;

    public ResultsEntity createOrUpdateResult(ResultsEntity result) {
        return repository.save(result);
    }


    public ResultsEntity findResultById(Integer id) throws NotFoundException {
        ResultsEntity result = repository.findById(id).get();
        if(result==null){
            throw new NotFoundException("Результат не найден");
        }
        return result;
    }

    public List<ResultsEntity> getAll() {
        return repository.findAll();
    }
}
