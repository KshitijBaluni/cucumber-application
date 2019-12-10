package thread;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleThreads {

    private final static Logger log = LoggerFactory.getLogger(SimpleThreads.class);


    static void threadMessage(String message) {
        String threadName = Thread.currentThread().getName();
        log.debug(threadName + " " + Thread.currentThread().getId() + " : " + message);
    }

    public static void main(String[] args) {
        threadMessage("Main Thread Started.");
        threadMessage("Main Thread Ends.");
    }
}
