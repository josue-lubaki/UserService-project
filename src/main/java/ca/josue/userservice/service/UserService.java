package ca.josue.userservice.service;

import ca.josue.userservice.domain.Role;
import ca.josue.userservice.domain.User;

import java.util.List;

/**
 * @author Josue Lubaki
 * @version 1.0
 * @since 2022-03-11
 */
public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
