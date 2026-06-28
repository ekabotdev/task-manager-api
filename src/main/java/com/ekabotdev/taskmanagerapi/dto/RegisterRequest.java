package com.ekabotdev.taskmanagerapi.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class RegisterRequest {
    private String username;
    private String password;
}
