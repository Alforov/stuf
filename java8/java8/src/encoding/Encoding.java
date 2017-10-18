package encoding;

import java.io.UnsupportedEncodingException;

/**
 * Created by mikhail_alferov on 18.10.2017.
 */
public class Encoding {
    public static void main(String[] args) throws UnsupportedEncodingException {
        char ch = 'a';
        char uniChar = '\u03A9';
        int chInt = uniChar;
        char chIntR = (char) chInt;
        System.out.println(ch);
        System.out.println(uniChar);
        System.out.println(chInt);
        System.out.println(chIntR);
          String s = "привет";
        byte[] bytes = s.getBytes("cp1251");

        char cStar = '\u002a';
        char slesh = '\u002f';
        System.out.println(cStar);
        System.out.println(slesh);
        System.out.println(new String(bytes,"utf-8"));
        System.out.println(new String(bytes,"cp1251"));
        System.out.println(new String(bytes,"windows-1251"));
        System.out.println(s);
    }
}
