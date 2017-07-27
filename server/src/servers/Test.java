package servers;

/**
 * Created by mikhail_alferov on 25.07.2017.
 */
public class Test {
    public static void main(String[] args) {
       testServer(new ThreadPooledServer(9000));
        //testServer(new MultiThreadedServer(9000));
        //testServer(new SingleThreadedServer(9000));
    }

    private static void testServer(Server server) {
        new Thread(server).start();
        try {
            Thread.sleep(20 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Stopping Server");
        server.stop();
    }
}