package rs.codecraft.lab.adapters.database.repository;

import rs.codecraft.lab.adapters.database.repository.jpa.UserJpaRepository;
import rs.codecraft.lab.core.entity.User;
import rs.codecraft.lab.core.exception.SaveUserFailedException;
import rs.codecraft.lab.core.repository.UserRepository;

import java.util.List;

public class UserRepositoryDB implements UserRepository {

    private UserJpaRepository userJpaRepository;

    @Override
    public User getUserByEmail(String email) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void saveUser(User user) throws SaveUserFailedException {

    }
}