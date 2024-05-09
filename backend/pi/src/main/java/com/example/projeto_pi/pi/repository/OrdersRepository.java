package com.example.projeto_pi.pi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projeto_pi.pi.entities.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Long>{
    
}
