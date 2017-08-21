/**
 * Created by mikhail_alferov on 21.08.2017.
 */
public class RevertString {
    public static void main(String[] args) {
        char i = 33333;
        System.out.println(i);
        String hello = "Hello world!";
      /*  System.out.println(reverseRecursively(hello));
        System.out.println(revertByStringBuilder(hello));
        System.out.println(revertByArray(hello));*/
        System.out.println(reverseStrange(hello));
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
        System.out.println("char length: " + s.toCharArray().length);
        int n = s.toCharArray().length - 1;
        System.out.println("n : " + n);
        for (int j = (n - 1) >> 1; j >= 0; j--) {
            System.out.println("------------------------------------");
            System.out.println("before: " + new String(value));
            System.out.println("j:" + j);
            int k = n - j;
            System.out.println("k:" + k);
            char cj = value[j];
            char ck = value[k];
            value[j] = ck;
            value[k] = cj;
            System.out.println("after: " + new String(value));
            System.out.println("------------------------------------");
        }
        return new String(value);
    }

    public static String simpleReverse(String s) {
        char[] value = s.toCharArray();
        int length = s.toCharArray().length;
        for (int i = 0; i >= (length - 1) / 2; i--) {
            char a = value[i];

        }
        return new String(value);
    }
}
