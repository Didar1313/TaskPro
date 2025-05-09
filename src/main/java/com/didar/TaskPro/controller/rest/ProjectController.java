package com.didar.TaskPro.controller.rest;

import com.didar.TaskPro.dto.ProjectRequestDTO;
import com.didar.TaskPro.service.Project;
import com.didar.TaskPro.service.ProjectService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name="Project Resource", description = "Api managing projects")
@RestController
public class ProjectController {
    @Autowired
    private ProjectService service;

    @Tag(name = "Create a project", description = "Create a new Project")
    @PostMapping("/api/projects")
    public Project create(@RequestBody ProjectRequestDTO dto) {
        return service.create(dto);
    }

    @Tag(name = "Get all projects", description = "List of Projects")
    @GetMapping("/api/projects")
    public List<Project> getAll() {
        return service.getAll();
    }

    @GetMapping("/api/projects/{id}")
    public Project getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PutMapping("/api/projects/{id}")
    public Project update(@PathVariable int id, @RequestBody ProjectRequestDTO dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/api/projects/{id}")
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "Deleted";
    }
}
