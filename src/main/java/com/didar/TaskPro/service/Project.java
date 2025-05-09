package com.didar.TaskPro.service;

public class Project {
    private static int count = 0;
    private String name;
    private String description;
    private int id;

    public Project(String name, String description) {
        this.id = count++;
        this.name = name;
        this.description = description;

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
