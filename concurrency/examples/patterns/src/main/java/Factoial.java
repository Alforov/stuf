import java.io.FileInputStream;
import java.util.Random;
import java.util.Spliterators;

/**
 * Created by root1 on 26.03.17.
 */
public class Factoial {
    public static Long getResult(Long value) {
        if (value == null || value < 0L) throw new IllegalArgumentException();
        if(value == 0L) return 1L;
        if (value == 1L) return value;
        return value * getResult(value - 1);
    }

    public static void main(String[] args) throws InterruptedException {
        long l = System.currentTimeMillis();
        for (int i = 0; i<100; i++){
            Thread t = new Thread(()->{});
          t.start();
        }
        System.out.println("time invocation: " + (System.currentTimeMillis() - l));
    }
}
