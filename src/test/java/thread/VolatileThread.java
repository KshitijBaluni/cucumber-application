package thread;

class Data {
    static volatile int num;

    public int getNum() {
        System.out.println(Thread.currentThread().getName() + " - Get ::" + num);
        return num;
    }

    public void setNum(int num) {
        this.num = num;
        System.out.println(Thread.currentThread().getName() + " - Set ::" + num);
    }

}

class VolatileProducer implements Runnable {
    Data data;

    public VolatileProducer(Data data) {
        this.data = data;
        Thread t = new Thread(this, "Volatile Producer");
        t.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            data.setNum(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class VolatileConsumer implements Runnable {
    Data data;

    public VolatileConsumer(Data data) {
        this.data = data;
        Thread t = new Thread(this, "Volatile Consumer");
        t.start();
    }

    @Override
    public void run() {
        while (true) {
            data.getNum();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class VolatileThread {
    static Data data1 = new Data();
    static Data data2 = new Data();

    public static void main(String[] args) {
        VolatileProducer volatileProducer = new VolatileProducer(data1);
        VolatileConsumer volatileConsumer = new VolatileConsumer(data2);
    }

}
