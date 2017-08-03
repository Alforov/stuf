import java.util.concurrent.*;

/**
 * Created by mikhail_alferov on 01.08.2017.
 */
public class Test {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        CustomCallable customCallable = new CustomCallable();
        ExecutorService executor = Executors.newFixedThreadPool(10);
        Future<String> submit = executor.submit(customCallable);
        Future<String> submit1 = executor.submit(customCallable);
        Future<String> submit2 = executor.submit(customCallable);
        Future<String> submit3 = executor.submit(customCallable);
        String s = submit.get(1000, TimeUnit.MILLISECONDS);
        System.out.println(s);
    }
}
