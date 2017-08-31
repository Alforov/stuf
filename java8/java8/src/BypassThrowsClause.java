import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by mikhail_alferov on 29.08.2017.
 */
public class BypassThrowsClause {
    public static void main(String[] args) {
        BypassThrowsClause bypassThrowsClause = new BypassThrowsClause();
        bypassThrowsClause.throwIOException();

    }
    private void throwIOException() {
        try {
            FileInputStream fileInputStream = new FileInputStream("");
        } catch (FileNotFoundException e) {
                helper(e);
        }

    }
    private static <T extends Throwable> void throws_(Class<T> clazz) throws T
    {
    }
    private <T extends Exception> void helper(Exception e) throws T {
        throw (T) e;
    }
}