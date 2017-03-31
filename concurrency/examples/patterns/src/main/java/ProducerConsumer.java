import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by root1 on 26.03.17.
 */
public class ProducerConsumer {
    public static void main(String[] args) {
        String[] holder = new String[1];
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        new Producer(holder,atomicBoolean).start();
        new Consumer(holder,atomicBoolean).start();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        atomicBoolean.set(false);
        System.out.println("The end");
    }

    private static class Producer extends Thread {
        private final String[] holder;
        private final AtomicBoolean flag;

        public Producer(String[] holder, AtomicBoolean flag) {
            this.holder = holder;
            this.flag = flag;
        }

        @Override
        public void run() {
            int count=0;
            while (flag.get()) {

                synchronized (holder) {
                    while (holder[0] != null) {
                        try {
                            holder.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    holder[0] = "Hi from producer " + count++;
                    System.out.println(holder[0]);
                    holder.notifyAll();
                }
            }
            System.out.println("producer is stopped");
        }
    }

    private static class Consumer extends Thread {
        private final String[] holder;
        private final AtomicBoolean flag;

        public Consumer(String[] holder, AtomicBoolean flag) {
            this.holder = holder;
            this.flag = flag;
        }

        @Override
        public void run() {
            while (flag.get()){
                synchronized (holder){
                    while (holder[0] == null){
                        try {
                            holder.wait();
                        } catch (InterruptedException e) {

                        }
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    String result = holder[0];
                    System.out.println("Consumer get result: " + result);
                    holder[0] = null;
                    holder.notifyAll();
                }
            }
        }
    }

}
