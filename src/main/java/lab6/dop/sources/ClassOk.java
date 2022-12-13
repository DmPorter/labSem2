package lab6.dop.sources;

import java.io.IOException;

public class ClassOk implements AutoCloseable{
    @Override
    public void close() throws IOException {
        System.out.println("The resources is closed");
    }
}
