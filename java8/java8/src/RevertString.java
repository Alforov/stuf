import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by mikhail_alferov on 21.08.2017.
 */
public class RevertString {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("wiki-100k.txt"));
        int available = fileInputStream.available();
        byte[] i = new byte[available];
         fileInputStream.read(i);


        String hello = new String(i);
        long l = System.currentTimeMillis();
       // reverseRecursively(hello);
        l = soutTime(l);
        revertByStringBuilder(hello);
        l = soutTime(l);
       revertByArray(hello);
        l = soutTime(l);
       reverseStrange(hello);
        l = soutTime(l);
       simpleReverse(hello);
        l = soutTime(l);
    }

    private static long soutTime(long l) {
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);
        return l1;
    }

    public static String reverseRecursively(String str) {
        if (str.length() < 2) {
            return str;
        }
        return reverseRecursively(str.substring(1)) + str.charAt(0);
    }

    public static String revertByStringBuilder(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static String revertByArray(String s) {
        char[] charArray = s.toCharArray();
        int length = charArray.length;
        char[] result = new char[length];
        int size = length - 1;
        for (int i = size; i >= 0; i--) {
            result[size - i] = charArray[i];
        }
        return new String(result);
    }

    public static String reverseStrange(String s) {
        char[] value = s.toCharArray();
        int n = s.toCharArray().length - 1;
        for (int j = (n - 1) >> 1; j >= 0; j--) {
            int k = n - j;
            char cj = value[j];
            char ck = value[k];
            value[j] = ck;
            value[k] = cj;

        }
        return new String(value);
    }

    public static String simpleReverse(String s) {
        char[] value = s.toCharArray();
        int length = s.toCharArray().length;
        int n = length -1;
        for (int i = 0; i < (length >> 1); i++) {
            char a = value[i];
            char b = value[n-i];
            value[i] = b;
            value[n-i] = a;

        }
        return new String(value);
    }
}
