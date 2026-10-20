package com.paper.trading.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.paper.trading.DTO.UserDto;
import com.paper.trading.Entity.UserEntity;
import com.paper.trading.Repository.UserRepository;

import jakarta.transaction.TransactionScoped;
import jakarta.transaction.Transactional;

@Service 
public class UserService {
    UserRepository userRepository;
    public UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }
    @Transactional 
    public void RegisterUser(UserDto user)
    {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(user.getUsername());
        userEntity.setPassword(user.getPassword());
        userEntity.setEmail(user.getEmail());
        userEntity.setContact(user.getContact());

        userRepository.save(userEntity);
    }

    public List<UserDto> getAllUsers()
    {
        return userRepository.findAll().stream().map(UserDto::fromEntity).toList();
    }
    
}
