import java.util.Calendar;

/**
 * Created by mikhail_alferov on 04.10.2017.
 */
public class ThreadStateTest {
    private static final Object o = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Hello from Thread:" + Thread.currentThread().getName());

                synchronized (o) {
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Hello from Thread1:" + Thread.currentThread().getName());
                System.out.println("Hello from Thread1:" + Thread.currentThread().getState());
            }
        });
        new Thread(new StatesChecker(thread)).start();
        Thread.sleep(400);
        thread.start();
        Calendar instance = Calendar.getInstance();


    }

    private static class StatesChecker implements Runnable {
        private final Thread thread;

        public StatesChecker(Thread thread) {
            this.thread = thread;
        }

        @Override
        public void run() {
            while (true) {
                System.out.println(thread.getState());
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {

                }
                if (thread.getState().equals(Thread.State.WAITING)) {
                    System.out.println(thread.getState());
                    synchronized (o) {
                        o.notifyAll();
                        System.out.println("xxx" + thread.getState());
                    }
                    System.out.println("xxx1" + thread.getState());
                }
            }
        }
    }
}
