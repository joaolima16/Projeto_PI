package com.example.projeto_pi.pi.entities;

import java.io.Serializable;
import java.util.List;

import com.example.projeto_pi.pi.entities.ENUM.Gender;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_users")
@Getter
@Setter
public class User implements Serializable {
    private final static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 30)
    private String name;

    @Column(unique = true, length = 14)
    private String cpf;

    @Column(unique = true, length = 50)
    private String email;
    
    private String password;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToMany
    private List<Address> id_address;
 
}
