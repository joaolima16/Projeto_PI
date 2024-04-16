package com.example.projeto_pi.pi.Controllers;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projeto_pi.pi.Record.UserRecord;
import com.example.projeto_pi.pi.entities.Address;
import com.example.projeto_pi.pi.entities.User;
import com.example.projeto_pi.pi.entities.ENUM.Gender;
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
    public ResponseEntity createUser(@RequestBody User user , @PathVariable("id") Long id) {
        Address address;
        user.setGenger(Gender.M);
        address = addressCase.getAddressById(id);
        user.setId_address(address);
        userCase.createUser(user);
        return ResponseEntity.ok().body(user.getId_address());
    }

    @PostMapping("/teste")
    public ResponseEntity teste(@RequestBody User user) {
        user.setGenger(Gender.M);

        return ResponseEntity.ok().body(user);
    }

    @PostMapping("/login")
    public ResponseEntity<User> LoginUser(@RequestBody UserRecord userRecord) {
        User user = userCase.findByEmailAndPassword(userRecord);
    
        return ResponseEntity.ok().body(user);

    }
}
