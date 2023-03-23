package makeerd.makeerd.repository;

import makeerd.makeerd.domain.JoinUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequiredUserRepository extends JpaRepository<JoinUser, Long> {
}
