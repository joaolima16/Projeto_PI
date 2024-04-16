package com.example.projeto_pi.pi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projeto_pi.pi.entities.User;




public interface UserRepository extends JpaRepository<User, Long>{
   Optional<User> findByEmailAndPassword(String email, String password);
}
