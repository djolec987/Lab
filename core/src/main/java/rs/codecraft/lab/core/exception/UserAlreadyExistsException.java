package rs.codecraft.lab.core.exception;

public class UserAlreadyExistsException extends SaveUserFailedException {

    public UserAlreadyExistsException(Throwable t) {
        super(t);
    }

}
