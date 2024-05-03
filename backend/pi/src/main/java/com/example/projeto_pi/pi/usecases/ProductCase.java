package com.example.projeto_pi.pi.usecases;

import java.util.List;
import java.util.Optional;

import javax.swing.text.html.Option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projeto_pi.pi.entities.Product;
import com.example.projeto_pi.pi.repository.ProductRepository;

@Service
public class ProductCase {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> listaProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> findById(Long id){
        Optional<Product> product = productRepository.findById(id);
        return product; 
    }
}
