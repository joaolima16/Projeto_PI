package com.example.projeto_pi.pi.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class testConfig implements CommandLineRunner{
    @Override
    public void run(String... args){
        
    }
}
