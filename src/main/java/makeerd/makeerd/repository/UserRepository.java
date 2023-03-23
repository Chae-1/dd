package makeerd.makeerd.repository;

import makeerd.makeerd.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
