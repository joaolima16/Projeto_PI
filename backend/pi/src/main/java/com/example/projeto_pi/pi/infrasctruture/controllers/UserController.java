package com.example.projeto_pi.pi.infrasctruture.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projeto_pi.pi.application.usecases.CreateUserCase;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private CreateUserCase createUserCase;
    
    
}
