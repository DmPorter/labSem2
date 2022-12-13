package lab5.dop.exceptions;

import java.io.IOException;

public class CannotCreateFileException extends IOException {

    public CannotCreateFileException(String message) {
        super(message);
    }

    public CannotCreateFileException(String message, Throwable cause) {
        super(message, cause);
    }
}
