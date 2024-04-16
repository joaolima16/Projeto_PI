package com.example.projeto_pi.pi.usecases;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.projeto_pi.pi.entities.Address;
import com.example.projeto_pi.pi.repository.AddressRepository;

public class AddressCase {

    @Autowired
    AddressRepository addressRepository;

    public Address getAddressById(long id){
        Address address;
        address = addressRepository.findById(id).orElseThrow(() -> new RuntimeException("Endereço não encontrado"));
        return address;
    }
}
