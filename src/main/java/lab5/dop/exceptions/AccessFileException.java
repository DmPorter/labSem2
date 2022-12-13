package lab5.dop.exceptions;

import java.nio.file.FileSystemException;


//Thrown when a file system operation fails on one or two files.
//This class is the general class for file system exceptions.
public class AccessFileException extends FileSystemException {
    public AccessFileException(String message) {
        super(message);
    }
}
