package com.example.projeto_pi.pi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projeto_pi.pi.entities.Product;
import java.util.List;



public interface ProductRepository extends JpaRepository<Product, Long>{
    Optional<Product> findById(Long id);
    List<Product> findByName(String name);
}
