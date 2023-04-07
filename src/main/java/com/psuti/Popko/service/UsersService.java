package com.psuti.Popko.service;

import com.psuti.Popko.dao.UsersEntityRepository;
import com.psuti.Popko.entities.UsersEntity;
import com.psuti.Popko.exceptions.AlreadyExistException;
import com.psuti.Popko.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService implements UserDetailsService {

    @Autowired
    UsersEntityRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = usersRepository.findUserByEmail(email);
        return user;
    }

    public UsersEntity createUser(UsersEntity user) throws AlreadyExistException {
        if (usersRepository.findByEmail(user.getEmail())!=null){
            throw new AlreadyExistException("Клиент с такой почтой уже зарегистрирован");
        }
        return usersRepository.save(user);
    }

    public UsersEntity findUserById(Integer id) throws NotFoundException {
        UsersEntity user = usersRepository.findById(id).get();
        if(user==null){
            throw new NotFoundException("Клиент не найден");
        }
        return user;
    }

    public List<UsersEntity> getAll() {
        return usersRepository.findAll();
    }

    public String deleteUserById(Integer id) {
        UsersEntity user = usersRepository.findById(id).get();
        usersRepository.deleteById(id);
        return "Клиент с почтовым адресом " + user.getEmail() + " удален";
    }
}
