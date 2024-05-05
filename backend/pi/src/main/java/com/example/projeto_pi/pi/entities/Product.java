package com.example.projeto_pi.pi.entities;

import java.io.Serializable;

import com.example.projeto_pi.pi.entities.ENUM.Category;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_product")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Category category;
    private String imgUrl;
    private double price;

}
