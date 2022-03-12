package ca.josue.userservice.repository;

import ca.josue.userservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Josue Lubaki
 * @version 1.0
 * @since 2022-03-11
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
