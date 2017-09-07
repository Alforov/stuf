/**
 * Created by mikhail_alferov on 06.09.2017.
 */
public class StringDoc {
    public static void main(String[] args) {
        tryToSplitDoc("НА015sad431");
    }

    private static String[] tryToSplitDoc(String doc) {
        String[] s = new String[2];
        s[0] = doc.substring(0, 2);
        s[1] = doc.substring(2, doc.length());
        return s;
    }
}
