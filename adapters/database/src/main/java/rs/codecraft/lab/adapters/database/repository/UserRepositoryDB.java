package rs.codecraft.lab.adapters.database.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import rs.codecraft.lab.adapters.database.entity.UserDao;
import rs.codecraft.lab.adapters.database.mapper.UserMapper;
import rs.codecraft.lab.adapters.database.repository.jpa.UserJpaRepository;
import rs.codecraft.lab.core.entity.User;
import rs.codecraft.lab.core.exception.SaveUserFailedException;
import rs.codecraft.lab.core.repository.UserRepository;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRepositoryDB implements UserRepository {

    private UserJpaRepository userJpaRepository;

    @Override
    public User getUserByEmail(String email) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        List<UserDao> userDaoList = userJpaRepository.findAll();
        List<User> users = UserMapper.INSTANCE.userDaoListToUserList(userDaoList);
        return users;
    }

    @Override
    public void saveUser(User user) throws SaveUserFailedException {

    }
}
