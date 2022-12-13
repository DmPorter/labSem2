package lab5.ex7;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.in.close();
        scanner.close();
        try(Scanner scanner1 = new Scanner(System.in)){
            scanner1.nextLine();
            scanner1.nextLine();
        }
    }


//    /**
//     * Closes this scanner.
//     *
//     * <p> If this scanner has not yet been closed then if its underlying
//     * {@linkplain java.lang.Readable readable} also implements the {@link
//     * java.io.Closeable} interface then the readable's {@code close} method
//     * will be invoked.  If this scanner is already closed then invoking this
//     * method will have no effect.
//     *
//     * <p>Attempting to perform search operations after a scanner has
//     * been closed will result in an {@link IllegalStateException}.
//     *
//     */
//    public void close() {
//        if (closed)
//            return;
//        if (source instanceof Closeable) {
//            try {
//                ((Closeable)source).close();
//            } catch (IOException ioe) {
//                lastException = ioe;
//            }
//        }
//        sourceClosed = true;
//        source = null;
//        closed = true;
//    }
}
