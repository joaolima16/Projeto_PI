package com.example.projeto_pi.pi.application.usecases;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.projeto_pi.pi.application.gateways.UserGateway;
import com.example.projeto_pi.pi.domain.entities.User;

public class CreateUserCase {

    @Autowired
    private UserGateway userGateway;
    
    public User createUser(User user){
        return userGateway.createUser(user);
    }
}
