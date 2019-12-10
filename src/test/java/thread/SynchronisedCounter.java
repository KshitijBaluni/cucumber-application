package thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronisedCounter {

    private final static Logger log = LoggerFactory.getLogger(SynchronisedCounter.class);
    private static Lock lock = new ReentrantLock();
    private int c = 0;

    public static void main(String[] args) throws InterruptedException {

        SynchronisedCounter synchronisedCounter = new SynchronisedCounter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronisedCounter.increment();
            }
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                synchronisedCounter.decrement();
            }
        });
        t2.start();

        t1.join();
        t2.join();

    }

    public void increment() {
        lock.lock();
        try {
            c++;
        } catch (Exception e) {
            log.debug(String.valueOf(e));
        } finally {
            lock.unlock();
        }

        log.info(Thread.currentThread().getName() + "::" + c);
    }

    public void decrement() {
        c--;
        log.info(Thread.currentThread().getName() + "::" + c);
    }

    public int value() {
        return c;
    }
}
