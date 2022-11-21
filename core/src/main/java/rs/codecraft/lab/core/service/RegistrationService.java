package rs.codecraft.lab.core.service;

import rs.codecraft.lab.core.entity.User;
import rs.codecraft.lab.core.exception.SaveUserFailedException;

public interface RegistrationService {

    boolean registerUser(User user) throws SaveUserFailedException;

}
