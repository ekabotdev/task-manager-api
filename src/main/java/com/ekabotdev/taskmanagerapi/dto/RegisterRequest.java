package com.ekabotdev.taskmanagerapi.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class RegisterRequest {

    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
