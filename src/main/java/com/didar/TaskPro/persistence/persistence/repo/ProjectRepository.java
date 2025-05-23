package com.didar.TaskPro.persistence.persistence.repo;

import com.didar.TaskPro.persistence.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
    // You get save(), findAll(), findById(), deleteById() for free!
}
