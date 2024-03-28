package com.example.projeto_pi.pi.infrasctruture.gateways;

import com.example.projeto_pi.pi.application.gateways.UserGateway;
import com.example.projeto_pi.pi.domain.entities.User;
import com.example.projeto_pi.pi.infrasctruture.persistence.UserEntity;
import com.example.projeto_pi.pi.infrasctruture.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateway{
    
 
    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;

    }
    @Override
    public User createUser(User userDomainObj){
        UserEntity userEntity = userEntityMapper.toEntity(userDomainObj);
        UserEntity savedObj = userRepository.save(userEntity);
        return userEntityMapper.toObj(savedObj);
    }
}
