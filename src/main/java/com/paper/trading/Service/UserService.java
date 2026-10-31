package com.paper.trading.Service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.paper.trading.Entity.User;
import com.paper.trading.Repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Transactional
    public User registerUser(String username, String rawPassword, String email, String contact) {
//        if (userRepository.findByUsername(username).isPresent()) {
//            throw new RuntimeException("User alread exists");
//        }

        String encodedPassword = passwordEncoder.encode(rawPassword);
        User newUser = new User(username, encodedPassword, email, contact, "ROLE_USER");
        return userRepository.save(newUser);
    }

}
