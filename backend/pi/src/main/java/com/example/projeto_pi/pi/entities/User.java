package com.example.projeto_pi.pi.entities;

import java.io.Serializable;

import com.example.projeto_pi.pi.entities.ENUM.Gender;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_users")
public class User implements Serializable {
    private final static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    
    private String name;
    private String cpf;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_address")
    private Address id_address;
 

    public User(){

    }

    public User(String name, String cpf, String email, String password, Gender gender, Address id_address) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.id_address = id_address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGenger(Gender gender) {
        this.gender = gender;
    }
    public Address getId_address() {
        return id_address;
    }

    public void setId_address(Address id_address) {
        this.id_address = id_address;
    }
}
