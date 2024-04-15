package com.example.crm.firstprojectapi.controller;

import com.example.crm.firstprojectapi.model.Users;
import com.example.crm.firstprojectapi.repository.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    public UsersRepository usersRepository;

    @GetMapping
    public List<Users> listar() {
        return usersRepository.findAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Users toAdd(@RequestBody Users user){
        return usersRepository.save(user);
    }
}
