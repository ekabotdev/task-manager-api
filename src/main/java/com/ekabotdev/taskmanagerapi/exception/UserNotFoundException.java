package com.ekabotdev.taskmanagerapi.exception;

import com.ekabotdev.taskmanagerapi.repository.UserRepository;

public class UserNotFoundException  extends RuntimeException{
    public UserNotFoundException(UserRepository userRepository) {
        super("User not found");
    }
}
