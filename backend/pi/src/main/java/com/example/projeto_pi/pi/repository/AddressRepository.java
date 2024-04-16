package com.example.projeto_pi.pi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projeto_pi.pi.entities.Address;
import java.util.List;


public interface AddressRepository extends JpaRepository<Address, Long>{
    Optional<Address> findById(long id);
}
