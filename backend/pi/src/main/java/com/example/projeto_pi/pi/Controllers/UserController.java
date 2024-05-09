package com.example.projeto_pi.pi.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projeto_pi.pi.Record.UserRecord;
import com.example.projeto_pi.pi.entities.User;
import com.example.projeto_pi.pi.usecases.AddressCase;
import com.example.projeto_pi.pi.usecases.UserCase;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserCase userCase;

    @Autowired
    private AddressCase addressCase;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        addressCase.insertAddress(user.getId_address().get(0));
        userCase.createUser(user);
        return ResponseEntity.ok().body(user);
    }

    @PostMapping("/login")
    public ResponseEntity<User> LoginUser(@RequestBody UserRecord userRecord) {
        User user = userCase.findByEmailAndPassword(userRecord);

        return ResponseEntity.ok().body(user);

    }
}
