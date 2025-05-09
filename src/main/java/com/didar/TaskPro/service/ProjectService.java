package com.didar.TaskPro.service;

import com.didar.TaskPro.dto.ProjectRequestDTO;
import com.didar.TaskPro.persistence.entity.Project;
import com.didar.TaskPro.persistence.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {
    private final List<Project> projects = new ArrayList<>();
    @Autowired
    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project create(ProjectRequestDTO dto) {
        Project project = new Project(dto.getName(), dto.getDescription());
        return projectRepository.save(project);
    }

    public List<Project> getAll() {
        return projectRepository.findAll();
    }

    public Project getById(int id) {
        return projectRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Result Not found"));
    }


    public Project update(int id, ProjectRequestDTO dto) {
        Project p = getById(id);
        p.setName(dto.getName());
        p.setDescription(dto.getDescription());
        return projectRepository.save(p);
    }

    public void delete(int id) {
        projectRepository.deleteById(id);

    }
}
