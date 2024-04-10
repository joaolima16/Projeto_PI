package com.example.projeto_pi.pi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projeto_pi.pi.entities.Order;

public interface OrderRepository extends JpaRepository<Long, Order>{
    
}
