package thread;

public class ScenarioThread implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Inside Scenario Thread");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
