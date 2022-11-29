package rs.codecraft.lab.adapters.database.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rs.codecraft.lab.adapters.database.repository.UserRepositoryDB;
import rs.codecraft.lab.adapters.database.repository.jpa.UserJpaRepository;
import rs.codecraft.lab.core.repository.UserRepository;

@Configuration
public class DatabaseConfig {

    @Bean
    public UserRepository userRepository(UserJpaRepository userJpaRepository) {
        return new UserRepositoryDB(userJpaRepository);
    }



}