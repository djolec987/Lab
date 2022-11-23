package rs.codecraft.lab.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rs.codecraft.lab.core.service.UserService;
import rs.codecraft.lab.core.service.impl.UserServiceImpl;

@Configuration
public class CoreConfig {

    @Bean
    public UserService userService() {
        System.out.println("Creating UserService bean");
        return new UserServiceImpl();
    }

}
