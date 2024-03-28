package com.example.projeto_pi.pi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projeto_pi.pi.model.User;



public interface UserRepository extends JpaRepository<User, Long>{
    
}
