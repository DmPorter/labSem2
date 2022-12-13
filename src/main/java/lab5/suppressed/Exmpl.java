package lab5.suppressed;

import java.util.Objects;

public class Exmpl implements AutoCloseable{
    private String name;

    public Exmpl(String name) {
        this.name = name;
    }

    @Override
    public void close() throws Exception {
        if(Objects.equals(name, "2")) throw new Exception();
        System.out.println(name);
    }
}
