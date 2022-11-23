package rs.codecraft.lab.core.repository;

import rs.codecraft.lab.core.entity.User;
import rs.codecraft.lab.core.exception.SaveUserFailedException;

import java.util.List;

public interface UserRepository {

    User getUserByEmail(String email);
    List<User> getAllUsers();
    void saveUser(User user) throws SaveUserFailedException;

}
