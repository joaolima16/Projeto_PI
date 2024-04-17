// package com.example.projeto_pi.pi.config;

// import java.util.Arrays;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.context.annotation.Profile;
// import org.springframework.core.annotation.Order;
// import org.springframework.stereotype.Component;

// import com.example.projeto_pi.pi.entities.Address;
// import com.example.projeto_pi.pi.entities.Category;
// import com.example.projeto_pi.pi.entities.Product;
// import com.example.projeto_pi.pi.entities.User;
// import com.example.projeto_pi.pi.entities.ENUM.Gender;
// import com.example.projeto_pi.pi.repository.AddressRepository;
// import com.example.projeto_pi.pi.repository.ProductRepository;
// import com.example.projeto_pi.pi.repository.UserRepository;

// @Configuration
// @Component

// public class testConfig implements CommandLineRunner {

//     @Autowired
//     private AddressRepository addressRepository;

//     @Autowired
//     private UserRepository userRepository;

//     @Autowired
//     private ProductRepository productRepository;

//     @Override
//     public void run(String... args) {

//         Category cat1 = new Category(null, "Periferico");
//         Category cat2 = new Category(null, "Processador");
//         Category cat3 = new Category(null, "Eletrodomestico");
//         Category cat4 = new Category(null, "Smartphone");

//         Product p1 = new Product(null,"Ryzen 5 5600G", "Processador AMD com x nucleos e x threads", "teste.jpg", 759.90);
//         Product p2 = new Product(null,"Mouse Redragon M718", "Mouse com 12000 de DPI da marca redragon", "teste.jpg", 120.50);
//         Product p3 = new Product(null,"IPhone 14", "Celular da marca apple com 12 gb de RAM e 256 GB de armazenamento", "teste.jpg", 5500.50);
        
//         Address a1 = new Address(null,"Bairro do limão", "teste", "SP");
//         Address a2 = new Address(null,"Bairro do jandira", "test1", "BA");
//         Address a3 = new Address(null,"Bairro do limoeiro", "teste3", "ES");

//         User u1 = new User("João", "1313167", "joao@teste.com", "1234", Gender.M, a1);
//         User u2 = new User("Jose", "08718787", "jose@gmail.com", "13578", Gender.M, a2);
//         User u3 = new User("Roberta", "877146778", "roberta@teste.com", "1234", Gender.F, a3);

//         addressRepository.saveAll(Arrays.asList(a1, a2, a3));
//         userRepository.saveAll(Arrays.asList(u1, u2, u3));
//     }
// }
