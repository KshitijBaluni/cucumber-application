package thread;

class SharedData {
    static int sharedData;

    public int getSharedData() {
        return sharedData;
    }

    public void setSharedData(int sharedData) {
        this.sharedData = sharedData;
    }
}


class StaticThread1 extends Thread {
    SharedData d;

    public StaticThread1(SharedData d) {
        this.d = d;
    }

    @Override
    public void run() {
        while (true) {
            StaticThreadTest.sharedVar++;
            System.out.println("Static Thread 1 ::: " + StaticThreadTest.sharedVar);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class StaticThread2 extends Thread {

    SharedData d;

    public StaticThread2(SharedData d) {
        this.d = d;
    }

    @Override
    public void run() {
        while (true) {
            StaticThreadTest.sharedVar++;
            System.out.println("Static Thread 2 ::: " + StaticThreadTest.sharedVar);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class StaticThreadTest {
    static int sharedVar = 0;

    public static void main(String[] args) {
        SharedData sharedData = new SharedData();
        StaticThread1 t1 = new StaticThread1(sharedData);
        StaticThread2 t2 = new StaticThread2(sharedData);

        t1.start();
        t2.start();

    }

}
