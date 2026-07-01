package com.ekabotdev.taskmanagerapi.controller;


import com.ekabotdev.taskmanagerapi.dto.LoginRequest;
import com.ekabotdev.taskmanagerapi.dto.LoginResponse;
import com.ekabotdev.taskmanagerapi.dto.RegisterRequest;
import com.ekabotdev.taskmanagerapi.dto.RegisterResponse;
import com.ekabotdev.taskmanagerapi.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/register")
    public RegisterResponse registerUser(@RequestBody RegisterRequest registerRequest) {
        return userService.register(registerRequest);
    }
    @PostMapping("/login")
    public LoginResponse loginUser(@RequestBody LoginRequest loginRequest) {
        return userService.login(loginRequest);
    }
}
