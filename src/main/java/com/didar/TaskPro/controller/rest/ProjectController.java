package com.didar.TaskPro.controller.rest;

import com.didar.TaskPro.dto.ProjectRequestDTO;
import com.didar.TaskPro.dto.ProjectResponseDTO;
import com.didar.TaskPro.persistence.domain.Project;
import com.didar.TaskPro.service.ProjectService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Tag(name="Project Resource", description = "Api managing projects")
@RestController
@Validated
public class ProjectController {

    @Autowired
    ProjectService service;

    @Tag(name = "Create a project", description = "Create a new Project")
    @PostMapping("/api/projects")
    public Project create(@Valid @RequestBody ProjectRequestDTO dto) {
        return service.create(dto);
    }

    @Tag(name = "Get all projects", description = "List of Projects")
    @GetMapping("/api/projects")
    public List<Project> getAll() {
        return service.getAll();
    }
    @Tag(name = "Get item by id", description = "Search by id for get the desire item")
    @GetMapping("/api/projects/{id}")
    public Project getById(@PathVariable @NotNull @Min(value = 1, message = "ID must be greater than 0") int id) {
        return service.getById((long) id);
    }

    @Tag(name = "Update the project", description = "Update the project by id")
    @PutMapping("/api/projects/{id}")
    public Project update(@PathVariable @NotNull @Min(value = 1, message = "ID must be greater than 0")
                              Long id, @RequestBody ProjectResponseDTO projectUpdateDTO) {
        return service.update(id, projectUpdateDTO);
    }

    @Tag(name = "Delete projects", description = "Delete Projects by id")
    @DeleteMapping("/api/projects/{id}")
    public String delete(@PathVariable @NotNull @Min(value = 1, message = "ID must be greater than 0") Long id) {
        service.delete(id);
        return "Deleted";
    }
}
