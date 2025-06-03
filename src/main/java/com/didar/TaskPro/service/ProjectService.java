package com.didar.TaskPro.service;

import com.didar.TaskPro.dto.ProjectRequestDTO;
import com.didar.TaskPro.dto.ProjectResponseDTO;
import com.didar.TaskPro.exception.custom.NotFoundException;
import com.didar.TaskPro.mapper.ProjectMapper;
import com.didar.TaskPro.persistence.domain.Project;
import com.didar.TaskPro.persistence.persistence.repo.ProjectRepository;
import com.didar.TaskPro.persistence.persistence.entity.ProjectEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    public Page<Project> getAll(Pageable pageable) {
        return projectRepository.findAll(pageable)
                .map(ProjectMapper::toDomain);
    }


    public Project getById(Long id) {
        ProjectEntity entity = projectRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Not found"));
        return ProjectMapper.toDomain(entity);
    }

    public Project update(Long id, ProjectResponseDTO dto) {
        ProjectEntity entity = projectRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Not found"));
        entity.setDescription(dto.getDescription());
        return ProjectMapper.toDomain(projectRepository.save(entity));
    }

    public void delete(Long id) {
        projectRepository.deleteById(id);
    }

}
