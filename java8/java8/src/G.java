import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by mikhail_alferov on 10.08.2017.
 */
public class G {
    static HashMap<Character, Character> bracketMap = new HashMap<>();
    static List<Character> startBrackets;
    static List<Character> endBrackets;

    static {
        bracketMap.put('}', '{');
        bracketMap.put(']', '[');
        bracketMap.put(')', '(');

        startBrackets = Arrays.asList('{', '(', '[');
        endBrackets = Arrays.asList('}', ')', ']');
    }


    public static void main(String[] args) {
        String inputString = "(2)( + 3x){bla,() bla}(({[]}))[]";
        char[] inputChars = inputString.toCharArray();

        LinkedList<Character> brackets = new LinkedList<>();
        for (char inputChar : inputChars) {
            if (startBrackets.contains(inputChar)) {
                brackets.add(inputChar);

            } else if (endBrackets.contains(inputChar)) {

                if (!brackets.isEmpty() && bracketMap.get(inputChar).equals(brackets.getLast())) {
                    brackets.removeLast();
                } else {
                    throw new IllegalArgumentException("not Valid");
                }
            }
        }

        if (brackets.isEmpty()) {
            System.out.println("Valid");
        } else {
            throw new IllegalArgumentException("not Valid");
        }
    }
}
