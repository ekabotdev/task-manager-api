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
public class CreateTaskRequest {

    @NotBlank
    private String title;
    @NotBlank
    private String description;
}
