package com.ekabotdev.taskmanagerapi.service;


import com.ekabotdev.taskmanagerapi.dto.RegisterRequest;
import com.ekabotdev.taskmanagerapi.dto.RegisterResponse;
import com.ekabotdev.taskmanagerapi.exception.UsernameAlreadyExistsException;
import com.ekabotdev.taskmanagerapi.repository.UserRepository;

 import com.ekabotdev.taskmanagerapi.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public RegisterResponse register(RegisterRequest request) {
        if (userRepository.existsByUsername(request.getUsername())) {
            throw new UsernameAlreadyExistsException("Username already exists"
            );
        }
        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());

        User userSaved = userRepository.save(user);
        return new RegisterResponse(
                "User registered successfully"
        );
    }

}
