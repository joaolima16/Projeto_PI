package com.example.projeto_pi.pi.usecases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projeto_pi.pi.entities.Address;
import com.example.projeto_pi.pi.repository.AddressRepository;

@Service
public class AddressCase {

    @Autowired
    AddressRepository addressRepository;

    public Address getAddressById(long id) {
        Address address;
        address = addressRepository.findById(id).orElseThrow(() -> new RuntimeException("Endereço não encontrado"));
        return address;
    }

    public Address insertAddress(Address list) {
        addressRepository.save(list);
        return list;
    }
}
