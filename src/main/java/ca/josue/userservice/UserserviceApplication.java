package ca.josue.userservice;

import ca.josue.userservice.domain.Role;
import ca.josue.userservice.domain.User;
import ca.josue.userservice.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class UserserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserserviceApplication.class, args);
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    CommandLineRunner run(UserService userService){
        return args -> {
            userService.saveRole(new Role(null, "ROLE_USER"));
            userService.saveRole(new Role(null, "ROLE_MANAGER"));
            userService.saveRole(new Role(null, "ROLE_ADMIN"));
            userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

            userService.saveUser(new User(null, "Josue Lubaki", "josue", "Josue2022", new ArrayList<>()));
            userService.saveUser(new User(null, "Jonathan Kanyinda", "jonathan", "Jonathan2022", new ArrayList<>()));
            userService.saveUser(new User(null, "Ismael Coulibaly", "ismael", "Ismael2022", new ArrayList<>()));
            userService.saveUser(new User(null, "Jordan Kuibia", "jordan", "Jordan2022", new ArrayList<>()));

            userService.addRoleToUser("josue", "ROLE_SUPER_ADMIN");
            userService.addRoleToUser("josue", "ROLE_USER");
            userService.addRoleToUser("josue", "ROLE_ADMIN");
            userService.addRoleToUser("jordan", "ROLE_USER");
            userService.addRoleToUser("ismael", "ROLE_MANAGER");
            userService.addRoleToUser("jonathan", "ROLE_ADMIN");
            userService.addRoleToUser("jonathan", "ROLE_MANAGER");

        };
    }

}
