package com.didar.TaskPro.persistence.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity
@Getter
public class ProjectEntity {
    private String name;

    @Setter
    private String description;
    @Id
    @GeneratedValue
    private Long id;




    public ProjectEntity(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

}
