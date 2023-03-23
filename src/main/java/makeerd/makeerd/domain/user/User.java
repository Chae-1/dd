package makeerd.makeerd.domain.user;

import jakarta.persistence.*;
import lombok.*;
import makeerd.makeerd.domain.JoinUser;

import java.util.List;

@Entity
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(of = {"age", "email"})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer age;

    private String password;

    private String email;

    private String nickname;

    private String name;

    @Enumerated(value = EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "user")
    private List<JoinUser> joinUsers;
//
//    @OneToMany
//    private List<Project> projects = new ArrayList<>();


}
