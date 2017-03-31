package cs.thread;

import java.util.Queue;

/**
 * Created by mikhail_alferov on 22.03.2017.
 */
public class Consumer extends Thread {
    private Queue<Integer> buffer;
    private Integer maxSize;


    public Consumer(Queue<Integer> buffer, int maxSize, String name) {
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
                while (buffer.isEmpty()) {
                  /*  System.out.println("Queue is empty,"
                            + "Consumer thread is waiting"
                            + " for producer thread to put something in queue");*/
                    try {
                        buffer.wait();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }

                }
                System.out.println("Consuming value : " + buffer.remove());
                buffer.notifyAll();
            }

        }
    }
}
