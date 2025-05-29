package com.didar.TaskPro.mapper;

import com.didar.TaskPro.persistence.domain.Project;
import com.didar.TaskPro.persistence.persistence.entity.ProjectEntity;
import com.didar.TaskPro.dto.ProjectRequestDTO;


public class ProjectMapper {
    public static Project toDomain(ProjectEntity entity) {
        return new Project(entity.getId(), entity.getName(), entity.getDescription());
    }

    public static ProjectEntity fromDto(ProjectRequestDTO dto) {
        return new ProjectEntity(null,dto.getName(), dto.getDescription());
    }
}
