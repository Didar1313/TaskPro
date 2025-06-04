package com.didar.TaskPro.persistence.persistence.repo;

import com.didar.TaskPro.persistence.persistence.entity.ProjectEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {
    Page<ProjectEntity> findAll(Pageable pageable);
    List<ProjectEntity> findByNameContainingIgnoreCase(String name);

    // You get save(), findAll(), findById(), deleteById() for free!
}
