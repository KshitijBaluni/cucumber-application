package thread;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleThreads {

    private final static Logger log = LoggerFactory.getLogger(SimpleThreads.class);

    static void threadMessage(String message) {
        String threadName = Thread.currentThread().getName();
        log.info(threadName + " " + Thread.currentThread().getId() + " : " + message);
    }

    public static void main(String[] args) throws InterruptedException {
        threadMessage("Main Thread Started.");

        long patience = 1000 * 60 * 60;

        if (args.length > 0) {
            try {
                patience = Long.parseLong(args[0]) * 1000;
            } catch (NumberFormatException e) {
                log.error("Argument must be an integer.");
            }
        }

        threadMessage("Starting MessageLoop Thread");
        long starttime = System.currentTimeMillis();
        Thread t = new Thread(new MessageLoop());
        t.start();

        threadMessage("Waiting for thread message loop to finish");
        while (t.isAlive()) {
            threadMessage("Still waiting");

            t.join(1000);
            if ((System.currentTimeMillis() - starttime) > patience && t.isAlive()) {
                threadMessage("Tired of waiting");
                t.interrupt();
                t.join();
            }
        }


        threadMessage("Finally Main Thread Ends.");
    }

    private static class MessageLoop implements Runnable {

        @Override
        public void run() {
            String messageInfo[] = {"message to test list",
                    "I will make it right",
                    "Memories",
                    "Test and make it awesome!!!",
                    "Change is difficult in the beginning",
                    "Messy in the middle",
                    "Beautiful in the end"};

            for (String message : messageInfo) {
                threadMessage(message);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    log.debug(String.valueOf(e));
                    threadMessage("it wasn't done");
                }
            }
        }
    }
}
