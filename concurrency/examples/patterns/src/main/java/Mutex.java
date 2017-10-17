/**
 * Created by mikhail_alferov on 04.10.2017.
 */
public class Mutex {
    private static final Object mutex = new Object();
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            synchronized (mutex){
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {

                }
                try {
                    mutex.wait();
                    System.out.println("after Wait");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        Thread thread1 = new Thread(() -> {
            synchronized (mutex){
                System.out.println("Hello");
                mutex.notifyAll();
            }
        });

        thread.start();
        Thread.sleep(1000);
        thread1.start();

    }
}
