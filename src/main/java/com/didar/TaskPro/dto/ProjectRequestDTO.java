package com.didar.TaskPro.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class ProjectRequestDTO {

    @NotBlank(message = "Project name is required")
    private String name;
    private String description;

}
