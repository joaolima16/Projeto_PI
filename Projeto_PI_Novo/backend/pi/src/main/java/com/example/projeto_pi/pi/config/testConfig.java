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
//         Product p4 = new Product(null,"PC Gamer", "Intel i5-10400F, GeForce RTX 4060 8GB, 16GB DDR4, SSD 240GB M.2", Category.COMPUTADOR,"https://encrypted-tbn3.gstatic.com/shopping?q=tbn:ANd9GcT45A_tYdjwsEEZqNOHRwI09w9vMWv_yl_g_UsYL5BqPvalnXA0hwAWHL9f_gNUHqXF8QHoS3Z-oUjmWFtPT9EIyjJHxqfcn6EpXGRZ1lfRtEljaStgVNyWL3lPmnpHSpPmQtJVNA&usqp=CAc", 4900);
//         Product p5 = new Product(null,"PC Gamer Ryzen", "AMD Ryzen 5 5600, GeForce RTX 3050 6GB, 16GB DDR4, SSD 480GB", Category.COMPUTADOR,"https://encrypted-tbn1.gstatic.com/shopping?q=tbn:ANd9GcQMjvratcPNi2AVFA2LzuMVwHrmxl3vSwo3RTcKsi6e98V09zYteawwtx7jQAll4ofxLkWKgc6S1Ng-qQHKMJtEPtVOhl0AidTQT4Zx03MA4xYYAI2zsvRwzVmxRwDuRjWmLWU_lQ&usqp=CAc", 5500.50);
        
//         Product p6 = new Product(null,"Notebook Dell Inspiron", "12ª geração Intel® Core™ i7-1255U (10-core, cache de 12MB, até 4.7GHz)", Category.COMPUTADOR,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSApGQKL6DUTfVTy9F3VSz0BuDaoiFUBG9tVw&s", 3999.90);
//         Product p7 = new Product(null,"Notebook Dell Inspiron", "12ª geração Intel® Core™ i7-1255U (10-core, cache de 12MB, até 4.7GHz)", Category.COMPUTADOR,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSApGQKL6DUTfVTy9F3VSz0BuDaoiFUBG9tVw&s", 3999.90);
//         Product p8 = new Product(null,"Notebook Gamer Acer", "Notebook Gamer Acer Nitro V15 Intel Core i5-13420H, 8GB RAM, GeForce RTX 3050, SSD 512GB, 15.6 FHD IPS 144H", Category.COMPUTADOR,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSGKAqv4SW5d4-dVGjExIe97Hnu_gXmgmdOEw&s", 5500);
//         Product p9 = new Product(null,"Iphone 14", "Apple iPhone 14 128GB Meia-noite", Category.SMARTPHONE,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSMROVaNAugc5SAhczg-bFrsb43tUwihdG9GA&s", 4.699);
//         Product p10 = new Product(null,"Samsung S24", "Smartphone Samsung Galaxy S24 6,2\" Galaxy AI 256GB Preto 5G 8GB RAM Câm. Tripla 50MP + Selfie 12MP Bateria 4000mAh Dual Chip", Category.SMARTPHONE,"https://encrypted-tbn1.gstatic.com/shopping?q=tbn:ANd9GcSHOFUwlcs4pPcUGyNLImlcwysrkv_rWwCzfTRjgoWHrlKWJTC-22TuWdBa1VfKyRfxxU8xrnd0EE9vBS7QwBS-bePDenwtzm7_hJ3eW5KoQma6qLoY99UvFnI-ytQ8Q1WIsA1060O8&usqp=CAc", 4.699);
        
        
//         Address a1 = new Address(null,"Bairro do limão", "teste", "SP");
//         Address a2 = new Address(null,"Bairro do jandira", "test1", "BA");
//         Address a3 = new Address(null,"Bairro do limoeiro", "teste3", "ES");

//         User u1 = new User(null,"João", "1313167", "joao@teste.com", "1234", Gender.M);
//         User u2 = new User(null,"Jose", "08718787", "jose@gmail.com", "13578", Gender.M);
//         User u3 = new User(null, "Roberta", "877146778", "roberta@teste.com", "1234", Gender.F);

//         addressRepository.saveAll(Arrays.asList(a1, a2, a3));
//         userRepository.saveAll(Arrays.asList(u1, u2, u3));
//         productRepository.saveAll(Arrays.asList(p1,p2,p3, p4, p5, p6, p7, p8, p9, p10));
//     }
// }
