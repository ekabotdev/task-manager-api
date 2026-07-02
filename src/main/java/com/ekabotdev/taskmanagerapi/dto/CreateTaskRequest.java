package com.ekabotdev.taskmanagerapi.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CreateTaskRequest {

    private String title;
    private String description;
}
