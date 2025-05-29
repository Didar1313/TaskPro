package com.didar.TaskPro.service;

import com.didar.TaskPro.dto.ProjectRequestDTO;
import com.didar.TaskPro.dto.ProjectResponseDTO;
import com.didar.TaskPro.mapper.ProjectMapper;
import com.didar.TaskPro.persistence.domain.Project;
import com.didar.TaskPro.persistence.persistence.repo.ProjectRepository;
import com.didar.TaskPro.persistence.persistence.entity.ProjectEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;
    //Constructor Injection
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project create(ProjectRequestDTO dto) {
        ProjectEntity entity = ProjectMapper.fromDto(dto);
        return ProjectMapper.toDomain(projectRepository.save(entity));
    }

    public List<Project> getAll() {
        return projectRepository.findAll().stream()
                .map(ProjectMapper::toDomain)
                .collect(Collectors.toList());
    }

    public Project getById(Long id) {
        ProjectEntity entity = projectRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Not found"));
        return ProjectMapper.toDomain(entity);
    }

    public Project update(Long id, ProjectResponseDTO dto) {
        ProjectEntity entity = projectRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Not found"));
        entity.setDescription(dto.getDescription());
        return ProjectMapper.toDomain(projectRepository.save(entity));
    }

    public void delete(Long id) {
        projectRepository.deleteById(id);
    }
}
