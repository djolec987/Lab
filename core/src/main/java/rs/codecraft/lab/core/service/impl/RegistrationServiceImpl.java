package rs.codecraft.lab.core.service.impl;

import lombok.AllArgsConstructor;
import rs.codecraft.lab.core.entity.User;
import rs.codecraft.lab.core.exception.SaveUserFailedException;
import rs.codecraft.lab.core.exception.UserAlreadyExistsException;
import rs.codecraft.lab.core.repository.UserRepository;
import rs.codecraft.lab.core.service.EmailService;
import rs.codecraft.lab.core.service.RegistrationService;

@AllArgsConstructor
public class RegistrationServiceImpl implements RegistrationService {

    private UserRepository userRepository;
    private EmailService emailService;

    @Override
    public boolean registerUser(User user) throws SaveUserFailedException {
        try {
            userRepository.saveUser(user);
        } catch (Exception e) {
            throw e;
        }
        emailService.sendVerificationEmail(user);
        return true;
    }

}
