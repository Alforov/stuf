package cs.thread;

import java.util.Queue;
import java.util.Random;

/**
 * Created by mikhail_alferov on 22.03.2017.
 */
public class Producer extends Thread {
    private final Queue<Integer> buffer;
    private final Integer maxSize;

    public Producer(Queue<Integer> buffer, int maxSize, String name) {
        super(name);
        this.buffer = buffer;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (buffer) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                while (buffer.size() > maxSize) {
                    try {
                       /* System.out.println("Queue is full, "
                                + "Producer thread waiting for "
                                + "consumer to take something from queue");*/
                        buffer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Random random = new Random();
                int i = random.nextInt();
                System.out.println("Producing value : " + i);
                buffer.add(i);
                buffer.notifyAll();
            }

        }
    }
}
