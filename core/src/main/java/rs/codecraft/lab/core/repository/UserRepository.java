package rs.codecraft.lab.core.repository;

import rs.codecraft.lab.core.entity.User;
import rs.codecraft.lab.core.exception.SaveUserFailedException;

public interface UserRepository {

    User getUserByEmail(String email);
    void saveUser(User user) throws SaveUserFailedException;

}
