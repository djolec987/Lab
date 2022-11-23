package rs.codecraft.lab.adapters.rest.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.codecraft.lab.core.entity.User;
import rs.codecraft.lab.core.service.UserService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @GetMapping("/list")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

}
