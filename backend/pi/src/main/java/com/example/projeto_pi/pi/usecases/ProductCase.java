package com.example.projeto_pi.pi.usecases;

import java.util.List;


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

    public Product findById(Long id){
        Product product;
        product = productRepository.findById(id).orElseThrow(() ->new RuntimeException("Produto não encontrado"));
        return product; 
    }
}
