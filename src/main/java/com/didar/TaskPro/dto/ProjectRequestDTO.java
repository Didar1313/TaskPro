package com.didar.TaskPro.dto;
public class ProjectRequestDTO {
    private String name;
    private String description;

    public ProjectRequestDTO(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
