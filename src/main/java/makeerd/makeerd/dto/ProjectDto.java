package makeerd.makeerd.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import makeerd.makeerd.domain.Project;
import makeerd.makeerd.domain.ProjectStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDto {
    private String title;
    private String description;
    private String openChatUrl;
    private String voiceChatUrl;
    private List<FieldsDto> fields;
    private List<String> references;

    public void printFields() {
        for (FieldsDto field : fields) {
            System.out.println(field);
        }
    }

    public Project createNewProject() {
        return Project.builder()
                .createDate(LocalDateTime.now())
                .description(this.description)
                .status(ProjectStatus.START)
                .openChatUrl(this.openChatUrl)
                .voiceChatUrl(this.voiceChatUrl)
                .title(this.title)
                .joinUsers(new ArrayList<>())
                .build();
    }

}
