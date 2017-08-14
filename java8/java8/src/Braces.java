import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by mikhail_alferov on 10.08.2017.
 */
public class Braces {
    static List<Character> braces = Arrays.asList('(', '{', '[', ')', '}', ']');

    public static void main(String[] args) {
        String braces = "(((dfhg))()(*)fgdh)";
        List<Character> list = new ArrayList<>();
        char[] charArray = braces.toCharArray();
        for (char c : charArray) {
            list.add(c);
        }
        countBraces(list, '{', '}');
        countBraces(list, '(', ')');
        countBraces(list, '[', ']');
       // List<Character> replacedAnotherChars = list.stream().filter(it-> ))
        checkDiffBraces(list);

    }

    private static void countBraces(List<Character> list, char c, char c1) {
        if (list.stream().filter(it -> it == c || it == c1).count() % 2 == 0) {
            throw new RuntimeException("Problem with this type of braces: " + c + c1);
        }
    }


    private static void checkDiffBraces(List<Character> list) {

    }

    public static Character transform(Character c) {
        if (braces.contains(c)) return c;
        else return '*';
    }
}
