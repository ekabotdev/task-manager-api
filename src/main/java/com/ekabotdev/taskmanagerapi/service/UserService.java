package com.ekabotdev.taskmanagerapi.service;


import com.ekabotdev.taskmanagerapi.dto.LoginRequest;
import com.ekabotdev.taskmanagerapi.dto.LoginResponse;
import com.ekabotdev.taskmanagerapi.dto.RegisterRequest;
import com.ekabotdev.taskmanagerapi.dto.RegisterResponse;
import com.ekabotdev.taskmanagerapi.exception.InvalidCredentialsException;
import com.ekabotdev.taskmanagerapi.exception.UsernameAlreadyExistsException;
import com.ekabotdev.taskmanagerapi.repository.UserRepository;

 import com.ekabotdev.taskmanagerapi.entity.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    public UserService(UserRepository userRepository,  PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    public RegisterResponse register(RegisterRequest request) {
        if (userRepository.existsByUsername(request.getUsername())) {
            throw new UsernameAlreadyExistsException("Username already exists"
            );
        }
        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        User userSaved = userRepository.save(user);
        return new RegisterResponse(
                "User registered successfully"
        );
    }
    public LoginResponse login(LoginRequest loginRequest) {
        User user = userRepository.findByUsername(loginRequest.getUsername());
        if (user == null) {
            throw new InvalidCredentialsException("Invalid username or password ");
        }
        if (!passwordEncoder.matches(loginRequest.getPassword(), user.getPassword())) {
            throw new InvalidCredentialsException("Invalid username or password");
        }
        return new LoginResponse(
                "User logged in successfully"
        );

    }

}
