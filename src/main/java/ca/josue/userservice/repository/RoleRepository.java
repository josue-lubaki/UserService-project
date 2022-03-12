package ca.josue.userservice.repository;

import ca.josue.userservice.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Josue Lubaki
 * @version 1.0
 * @since 2022-03-11
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
