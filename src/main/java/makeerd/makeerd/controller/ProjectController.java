package makeerd.makeerd.controller;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import makeerd.makeerd.domain.Project;
import makeerd.makeerd.dto.ProjectDto;
import makeerd.makeerd.repository.ProjectRepository;
import makeerd.makeerd.service.ProjectService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectRepository projectRepository;
    private final ProjectService projectService;

    @PostMapping("/projects/add")
    public String addProjects(@RequestBody ProjectDto projectDto, HttpServletResponse response) {
        Long newProjectId = projectService.createProject(projectDto);
        return "ok";
    }

    private Project getProject() {
        return new Project();
    }
}
