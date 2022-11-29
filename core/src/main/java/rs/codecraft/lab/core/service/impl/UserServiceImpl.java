package rs.codecraft.lab.core.service.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rs.codecraft.lab.core.entity.User;
import rs.codecraft.lab.core.repository.UserRepository;
import rs.codecraft.lab.core.service.UserService;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

}
