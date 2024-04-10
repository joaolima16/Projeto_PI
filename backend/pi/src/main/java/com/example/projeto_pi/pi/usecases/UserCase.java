package com.example.projeto_pi.pi.usecases;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projeto_pi.pi.entities.User;
import com.example.projeto_pi.pi.repository.UserRepository;

@Service
public class UserCase {

    @Autowired
    private UserRepository userRepository;

    public void createUser(User user) {
        try {
            userRepository.save(user);
        } catch (RuntimeErrorException e) {
            throw new Error(e);
        }
    }
}
