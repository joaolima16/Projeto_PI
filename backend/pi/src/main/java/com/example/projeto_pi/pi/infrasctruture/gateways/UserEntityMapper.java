package com.example.projeto_pi.pi.infrasctruture.gateways;

import com.example.projeto_pi.pi.domain.entities.User;
import com.example.projeto_pi.pi.infrasctruture.persistence.UserEntity;

public class UserEntityMapper {
    public UserEntity toEntity(User userDomainObj){
        return new UserEntity(userDomainObj.nameString(), userDomainObj.cpf(), userDomainObj.email(), userDomainObj.password(), userDomainObj.genger(),0);
    }
    public User toObj(UserEntity userDomainEntity){
        return new User(userDomainEntity.getName(), userDomainEntity.getCpf(), userDomainEntity.getEmail(), userDomainEntity.getPassword(),userDomainEntity.getGender());
    }
}
