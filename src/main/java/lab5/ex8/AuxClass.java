package lab5.ex8;

import java.util.concurrent.locks.ReentrantLock;

public class AuxClass {

    public static final ReentrantLock REENTRANT_LOCK = new ReentrantLock();


    public static AutoCloseable lock() {
        REENTRANT_LOCK.lock();
        return () -> {
            try {
                if (REENTRANT_LOCK.isLocked())
                    REENTRANT_LOCK.unlock();
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
    }



}
