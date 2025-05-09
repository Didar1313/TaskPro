package com.didar.TaskPro.service;

import com.didar.TaskPro.dto.ProjectRequestDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {
    private final List<Project> projects = new ArrayList<>();

    public Project create(ProjectRequestDTO dto) {
        Project project = new Project(dto.getName(), dto.getDescription());
        projects.add(project);
        return project;
    }

    public List<Project> getAll() {
        return projects;
    }

    public Project getById(int id) {
        for (Project project : projects) {
            if (project.getId() == id) {
                return project;
            }
        }
        throw new IllegalArgumentException("Project not found");
    }


    public Project update(int id, ProjectRequestDTO dto) {
        Project p = getById(id);
        p.setName(dto.getName());
        p.setDescription(dto.getDescription());
        return p;
    }

    public void delete(int id) {
        Project p = getById(id);
        projects.remove(p);

    }
}
