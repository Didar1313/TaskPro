package com.didar.TaskPro.persistence.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@Getter
@AllArgsConstructor

public class Project {

    private Long id;
    private String name;
    private String description;


}
