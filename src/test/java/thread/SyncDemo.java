package thread;

class Counter {
    static int count = 0;

    public static synchronized void increment() {
        for (int i = 0; i < 10; i++) {
            count++;
            System.out.println(Thread.currentThread().getName() + "- " + count);
        }
    }
}

public class SyncDemo {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                /*try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/

                //Counter.count++;
                //for (int i = 0; i < 100; i++)
                counter.increment();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                /*try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/

                //Counter.count++;
                //for (int i = 0; i < 100; i++)
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        //Thread.sleep(500);
        System.out.println("Counter =" + counter.count + Thread.currentThread().getName());

    }
}
