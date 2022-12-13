package lab5.dop.exceptions;

import java.io.IOException;

public class IncorrectCommandException extends IOException {
    public IncorrectCommandException(String message) {
        super(message);
    }
}
