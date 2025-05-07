package com.didar.TaskPro.repository;

import com.didar.TaskPro.service.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
