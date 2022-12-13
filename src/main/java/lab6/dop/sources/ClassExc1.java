package lab6.dop.sources;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ClassExc1 implements AutoCloseable{
    @Override
    public void close() throws IOException {
        throw new IOException();
    }
}
