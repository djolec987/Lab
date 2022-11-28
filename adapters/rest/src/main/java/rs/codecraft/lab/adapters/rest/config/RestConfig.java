package rs.codecraft.lab.adapters.rest.config;

import org.springframework.context.annotation.Configuration;
import rs.codecraft.lab.adapters.rest.controller.UserController;
import rs.codecraft.lab.core.service.UserService;

@Configuration
public class RestConfig {

    public UserController userController(UserService userService) {
        return new UserController(userService);
    }

}
