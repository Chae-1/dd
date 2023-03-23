package makeerd.makeerd.domain;

import jakarta.persistence.*;
import lombok.*;
import makeerd.makeerd.domain.user.User;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Builder
@ToString(of = {"field", "detailField"})
public class JoinUser {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "required_user")
    private Long id;
    @Enumerated
    private JoinStatus status;
//    private String field;
//
//    private String detailField;
//
//    private Integer requiredQuantity; // 처음 등록,
//
//    private Integer currentQuantity; // 추가 될때 마다 추가
//    어떤 개발자가 몇명 필요 한가?
//    project에 참여한 user는 따로 권한이 존재 한다.

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "project_id")
    private Project project; // 어떤 프로젝트에 누가 참여 했다.

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    private User user; // user의 부가정보를 알고자 할때 join
}
