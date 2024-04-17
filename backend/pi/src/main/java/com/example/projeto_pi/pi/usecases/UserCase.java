package com.example.projeto_pi.pi.usecases;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projeto_pi.pi.Record.UserRecord;
import com.example.projeto_pi.pi.entities.User;
import com.example.projeto_pi.pi.repository.UserRepository;

@Service
public class UserCase {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        try {
            userRepository.save(user);
            return user;
        } catch (RuntimeErrorException e) {
            throw new Error(e);
        }
    }

    public User findByEmailAndPassword(UserRecord userRecord) {
        User user;
        user = userRepository.findByEmailAndPassword(userRecord.email(), userRecord.password())
                .orElseThrow(() -> new RuntimeException("Usuario não encontrado"));
        return user;

    }

}
