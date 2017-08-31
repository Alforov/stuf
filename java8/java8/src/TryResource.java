import java.io.IOException;


/**
 * Created by root1 on 31.08.17.
 */
public class TryResource {
    public static void main(String[] args) {
        try (Closable connection = new Closable()) {

        } catch (IOException e) {
            System.out.println("from exception");
        } finally {
            System.out.println("from final");
        }
    }
}
