import java.io.Closeable;
import java.io.IOException;

/**
 * Created by root1 on 31.08.17.
 */
public class Closable implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("close by resource");
    }
}
