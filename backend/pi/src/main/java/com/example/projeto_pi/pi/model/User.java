package com.example.projeto_pi.pi.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User implements Serializable{
        
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String cpf;
    private String email;
    private String password;
    private String gender;
    private int id_address;

    public User(){

    }

    public User(String name, String cpf ,String email, String password, String gender, int id_address) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.id_address = id_address;
    }
    
}
