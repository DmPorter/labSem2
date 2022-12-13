package lab5.dop.exceptions;

import java.io.IOException;

public class IncorrectFileNameException extends IOException{

    public IncorrectFileNameException(String message) {
        super(message);
    }

    public IncorrectFileNameException(String message, Throwable cause) {
        super(message, cause);
    }
}
