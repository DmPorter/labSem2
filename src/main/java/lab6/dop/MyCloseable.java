package lab6.dop;

public interface MyCloseable<E extends Exception> extends AutoCloseable {
    @Override
    void close() throws E;
}
