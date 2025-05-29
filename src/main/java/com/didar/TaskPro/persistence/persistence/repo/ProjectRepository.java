package com.didar.TaskPro.persistence.persistence.repo;

import com.didar.TaskPro.persistence.persistence.entity.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {
    // You get save(), findAll(), findById(), deleteById() for free!
}
