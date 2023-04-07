package com.psuti.Popko.service;

import com.psuti.Popko.dao.CustomersEntityRepository;
import com.psuti.Popko.entities.CustomersEntity;
import com.psuti.Popko.exceptions.AlreadyExistException;
import com.psuti.Popko.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomersService {

    @Autowired
    private CustomersEntityRepository customersRep;

    public CustomersEntity createCustomer(CustomersEntity customer) throws AlreadyExistException {
        if (customersRep.findByEmail(customer.getEmail())!=null){
            throw new AlreadyExistException("Пользователь с такой почтой уже зарегистрирован");
        }
        return customersRep.save(customer);
    }

    public CustomersEntity findCustomerById(Integer id) throws NotFoundException {
        CustomersEntity customer = customersRep.findById(id).get();
        if(customer==null){
            throw new NotFoundException("Пользователь не найден");
        }
        return customer;
    }

    public List<CustomersEntity> getAll() {
        return customersRep.findAll();
    }

    public String deleteCustomerById(Integer id) {
        CustomersEntity customer = customersRep.findById(id).get();
        customersRep.deleteById(id);
        return "Пользователь с почтовым адресом " + customer.getEmail() + " удален";
    }
}
