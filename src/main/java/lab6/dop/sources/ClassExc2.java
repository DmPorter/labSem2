package lab6.dop.sources;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class ClassExc2 implements AutoCloseable{
    @Override
    public void close() throws FileNotFoundException {
        throw new FileNotFoundException("exc2");
    }
}
