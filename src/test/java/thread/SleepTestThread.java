package thread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SleepTestThread {
    private final static Logger log = Logger.getLogger(SleepTestThread.class.getName());
    private final static boolean interruptStatus = Thread.interrupted();

    public static void main(String[] args) {

        log.log(Level.INFO, String.valueOf(interruptStatus));

        String importantMessages[] = {"we are testing a thread",
                "jamming is important",
                "awesome works are on the way",
                "we are positive that things are going to happen"};

        for (String message : importantMessages) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                //We have been interrupted no more crunching
                log.log(Level.WARNING, e.toString());
            }
            System.out.println("Message ::" + message);
        }

        log.log(Level.INFO, String.valueOf(interruptStatus));

        if (interruptStatus) {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                log.log(Level.INFO, e.toString() + "Interrupt Status Check");
            }
        }
    }
}
