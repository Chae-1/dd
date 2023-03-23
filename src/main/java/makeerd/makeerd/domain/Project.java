package makeerd.makeerd.domain;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.CascadeType.ALL;

@Entity
@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor
@Builder
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Lob
    private String description;

    @Enumerated(EnumType.STRING)
    private ProjectStatus status;
    @OneToMany(mappedBy = "project", cascade = ALL)
    private List<JoinUser> joinUsers = new ArrayList<>();

    @OneToMany(mappedBy = "project")
    private List<RequiredField> requiredFields = new ArrayList<>();

    private String voiceChatUrl;

    private String openChatUrl;

    private Integer total; // 전체

    private Integer current; // 현재

    private LocalDateTime createDate;

    private LocalDateTime updateDate;

    private LocalDateTime startProjectDate;

    public void addJoinUser(JoinUser joinUser) {
        System.out.println(joinUser);
        joinUser.setProject(this);
        joinUsers.add(joinUser);
    }
}