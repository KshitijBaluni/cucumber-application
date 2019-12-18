package thread;

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {

        Thread executorThread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Labrador Bark " + Thread.currentThread().getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        executorThread1.start();
        Thread.currentThread().join();

        Thread executorThread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Husky howl " + Thread.currentThread().getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });
        executorThread2.start();
    }
}
