import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by mikhail_alferov on 01.08.2017.
 */
public class CustomCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(800);
        return "hello";
    }
}
