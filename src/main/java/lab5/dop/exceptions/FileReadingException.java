package lab5.dop.exceptions;

import java.io.IOException;

public class FileReadingException extends IOException {
    public FileReadingException(String message) {
        super(message);
    }

    public FileReadingException(String message, Throwable cause) {
        super(message, cause);
    }
}
