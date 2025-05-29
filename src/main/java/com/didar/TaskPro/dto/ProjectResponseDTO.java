package com.didar.TaskPro.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProjectResponseDTO {

    private String description;

    public ProjectResponseDTO(String description) {

        this.description = description;
    }


}
