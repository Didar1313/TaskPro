package com.didar.TaskPro.dto;
public class ProjectUpdateDTO {

    private String description;

    public ProjectUpdateDTO(String description) {

        this.description = description;
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
