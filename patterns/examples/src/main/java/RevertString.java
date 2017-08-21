import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by root1 on 13.08.17.
 */
public class RevertString {
    public static void main(String[] args) {
        String test = "hello world";
        String test1 = "dlrow olleh";
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuilder.append(test1);
        stringBuffer.append(test1);
        System.out.println(stringBuilder.reverse().toString());
        System.out.println();
       System.out.println(stringBuffer.reverse().toString());
    }
}
