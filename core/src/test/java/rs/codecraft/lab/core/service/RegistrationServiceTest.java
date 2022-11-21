package rs.codecraft.lab.core.service;

import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import rs.codecraft.lab.core.entity.User;
import rs.codecraft.lab.core.exception.SaveUserFailedException;
import rs.codecraft.lab.core.exception.UserAlreadyExistsException;
import rs.codecraft.lab.core.repository.UserRepository;
import rs.codecraft.lab.core.service.impl.RegistrationServiceImpl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class RegistrationServiceTest {

    private UserRepository userRepository;
    private RegistrationService registrationService;
    private EmailService emailService;

    @BeforeEach
    void setup() {
        userRepository = mock(UserRepository.class);
        emailService = mock(EmailService.class);
        registrationService = new RegistrationServiceImpl(userRepository, emailService);
    }

    @Test
    @Description("Happy path")
    void shouldPersistUserToDatabaseAndSendVerificationEmail() {
        User user = new User();

        boolean success = false;
        try {
            success = registrationService.registerUser(user);
        } catch (SaveUserFailedException e) {
            e.printStackTrace();
        }
        // Check that user doesn't exist (based on email)

        // Exception should not be thrown when persisting user to DB

        // Verification email should be sent
        assertTrue(success);
    }

    @Test
    @Description("Persisting same user twice")
    void shouldThrowSaveUserExceptionWhenSavingSameUserTwice() {
        User user = new User();
        try {
            doNothing()
                    .doThrow(UserAlreadyExistsException.class)
                    .when(userRepository).saveUser(user);
            assertAll(
                    () -> assertTrue(registrationService.registerUser(user)),
                    () -> assertThrows(UserAlreadyExistsException.class, () -> registrationService.registerUser(user)),
                    () -> verify(emailService, times(1)).sendVerificationEmail(user)
            );
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
