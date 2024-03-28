package com.example.projeto_pi.pi.application.gateways;

import com.example.projeto_pi.pi.domain.entities.User;

public interface UserGateway {
    User createUser(User user);
}
