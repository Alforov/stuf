package cs.thread;


/**
 * Created by mikhail_alferov on 23.03.2017.
 */
public class Pipe<T> {
    volatile T o;

    private final Object monitor = new Object();

    public void put(T o) throws InterruptedException {
        synchronized (monitor) {
            this.o = o;
        }
        new Thread(() -> {
            try {
                monitor.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    public T get() {
        if (o != null) {
            monitor.notifyAll();
        }
        return o;

    }
}
