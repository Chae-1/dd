package makeerd.makeerd.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import makeerd.makeerd.domain.Project;
import makeerd.makeerd.domain.JoinUser;
import makeerd.makeerd.dto.FieldsDto;
import makeerd.makeerd.dto.ProjectDto;
import makeerd.makeerd.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class ProjectService {
    private final ProjectRepository projectRepository;

    public Long createProject(ProjectDto projectDto) {

        Project newProject = projectDto.createNewProject();
        List<JoinUser> joinUsers = FieldsDto.dtoToRequiredUsers(projectDto.getFields());
        for (JoinUser joinUser : joinUsers) {
            newProject.addRequiredUser(joinUser);
        }
        projectRepository.save(newProject);
        return newProject.getId();
    }

}

