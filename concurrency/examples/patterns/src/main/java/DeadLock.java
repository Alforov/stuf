/**
 * Created by root1 on 26.03.17.
 */
public class DeadLock {
    public static final Object leftMonitor = new Object();
    public static final Object rightMonitor = new Object();


    public static void main(String[] args) {
        new Thread(()->{doSomthing();}).start();
        new Thread(()->{doAnohterSomthing();}).start();
    }

    private static void doSomthing(){
        synchronized (leftMonitor){
            try {
                System.out.println("start to wait");
                Thread.sleep(1000_0);
                System.out.println("end to wait");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (rightMonitor){
                System.out.println("1");
            }
        }
    }

    private static void doAnohterSomthing(){
        synchronized (rightMonitor){
            synchronized (leftMonitor){
                System.out.println("2");
            }
        }
    }
}
