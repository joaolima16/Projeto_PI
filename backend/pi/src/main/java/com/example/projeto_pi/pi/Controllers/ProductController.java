package com.example.projeto_pi.pi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.server.ResponseStatusException;

import com.example.projeto_pi.pi.entities.Product;
import com.example.projeto_pi.pi.usecases.ProductCase;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductCase productCase;

    @GetMapping
    public List<Product> listProducts() {
        List<Product> lsProducts = productCase.listaProducts();
        try {
            return lsProducts;
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
