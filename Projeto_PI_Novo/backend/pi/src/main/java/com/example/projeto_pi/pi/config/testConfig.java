// package com.example.projeto_pi.pi.config;

// import java.util.Arrays;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.stereotype.Component;

// import com.example.projeto_pi.pi.entities.Address;
// import com.example.projeto_pi.pi.entities.Product;
// import com.example.projeto_pi.pi.entities.User;
// import com.example.projeto_pi.pi.entities.ENUM.Category;
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

//         Product p1 = new Product(null,"Ryzen 5 5600G", "Processador AMD com x nucleos e x threads", Category.COMPUTADOR,"https://s2-techtudo.glbimg.com/OerGdg72EqQP4UhaUFxL7TFxclY=/0x0:1280x800/984x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_08fbf48bc0524877943fe86e43087e7a/internal_photos/bs/2021/t/l/LioOu5SaKNu7uplKyggw/ryzen.jpg", 759.90);
//         Product p2 = new Product(null,"Mouse Redragon M718", "Mouse com 12000 de DPI da marca redragon", Category.PERIFERICO,"https://images.kabum.com.br/produtos/fotos/94555/mouse-gamer-redragon-cobra-chroma-rgb-12400dpi-7-botoes-preto-m711-v2_1656018617_g.jpg", 120.50);
//         Product p3 = new Product(null,"Intel Core I5 10900K", "Processador da intel da decima geração", Category.COMPUTADOR,"https://www.intel.com/content/dam/www/central-libraries/us/en/images/2023-01/newsroom-intel-13th-gen-i9-13900ks.jpg", 950.50);
//         Product p4 = new Product(null,"Samsung Galaxy s21", "Celular top de linha da samsung", Category.SMARTPHONE,"https://a-static.mlcdn.com.br/450x450/smartphone-samsung-galaxy-s21-fe-128gb-branco-5g-6gb-ram-tela-64-cam-tripla-selfie-32mp/magazineluiza/233990100/6cb73e13bfb042bdcc89a95fc70b2acc.jpg", 2000);
//         Product p5 = new Product(null,"IPhone 14", "Celular da marca apple com 12 gb de RAM e 256 GB de armazenamento", Category.SMARTPHONE,"teste.jpg", 5500.50);
//         Product p6 = new Product(null,"IPhone 14", "Celular da marca apple com 12 gb de RAM e 256 GB de armazenamento", Category.SMARTPHONE,"teste.jpg", 5500.50);
//         Product p7 = new Product(null,"IPhone 14", "Celular da marca apple com 12 gb de RAM e 256 GB de armazenamento", Category.SMARTPHONE,"teste.jpg", 5500.50);
        
//         Address a1 = new Address(null,"Bairro do limão", "teste", "SP");
//         Address a2 = new Address(null,"Bairro do jandira", "test1", "BA");
//         Address a3 = new Address(null,"Bairro do limoeiro", "teste3", "ES");

//         User u1 = new User("João", "1313167", "joao@teste.com", "1234", Gender.M, a1);
//         User u2 = new User("Jose", "08718787", "jose@gmail.com", "13578", Gender.M, a2);
//         User u3 = new User("Roberta", "877146778", "roberta@teste.com", "1234", Gender.F, a3);

//         addressRepository.saveAll(Arrays.asList(a1, a2, a3));
//         userRepository.saveAll(Arrays.asList(u1, u2, u3));
//         productRepository.saveAll(Arrays.asList(p1,p2,p3, p4));
//     }
// }
