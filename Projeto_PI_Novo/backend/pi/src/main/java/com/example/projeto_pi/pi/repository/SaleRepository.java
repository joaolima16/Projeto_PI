package com.example.projeto_pi.pi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projeto_pi.pi.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
    
}
