package thread;

class Q {
    int num;
    boolean setValueCheck = false;

    public synchronized int getNum() {

        if (!setValueCheck) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " - Get ::" + num);
        setValueCheck = false;
        notify();
        return num;
    }

    public synchronized void setNum(int num) {
        if (setValueCheck) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.num = num;
        System.out.println(Thread.currentThread().getName() + " - Set ::" + num);
        setValueCheck = true;
        notify();
    }

}

class Producer implements Runnable {
    Q q;
    public Producer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "Producer");
        t.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.setNum(i++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class Consumer implements Runnable {
    Q q;
    public Consumer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }

    @Override
    public void run() {
        while (true) {
            q.getNum();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class InterThread {

    public static void main(String[] args) {
        Q q = new Q();
        Consumer consumer = new Consumer(q);
        Producer producer = new Producer(q);
    }

}

