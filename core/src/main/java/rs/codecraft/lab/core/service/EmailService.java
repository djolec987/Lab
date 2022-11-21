package rs.codecraft.lab.core.service;

import rs.codecraft.lab.core.entity.User;

public interface EmailService {

    void sendVerificationEmail(User user);

}
