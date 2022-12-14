package rs.codecraft.lab.core.repository.fake;

import rs.codecraft.lab.core.entity.User;
import rs.codecraft.lab.core.exception.SaveUserFailedException;
import rs.codecraft.lab.core.repository.UserRepository;

import java.util.List;

public class UserRepositoryFake implements UserRepository {

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
