package com.didar.TaskPro.persistence.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
public class ProjectEntity {
    @Setter
    private String name;
    @Setter
    private String description;
    @Id
    @GeneratedValue
    private Long id;

}
