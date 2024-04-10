package com.example.projeto_pi.pi.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projeto_pi.pi.entities.User;
import com.example.projeto_pi.pi.entities.ENUM.Gender;
import com.example.projeto_pi.pi.usecases.UserCase;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    
    @Autowired
    private UserCase userCase;


    @PostMapping
    public ResponseEntity createUser(@RequestBody User user){
        // user.setGenger(Gender.M);
        // userCase.createUser(user);

        return ResponseEntity.ok().body(user.getId_address());
    }
    @PostMapping("/teste")
    public ResponseEntity teste(@RequestBody User user){
        user.setGenger(Gender.M);

        return ResponseEntity.ok().body(user);
    }
}
