package lab5.dop.exceptions;

import java.io.IOException;

public class FileWritingException extends IOException {

    public FileWritingException(String message) {
        super(message);
    }

    public FileWritingException(String message, Throwable cause) {
        super(message, cause);
    }
}
