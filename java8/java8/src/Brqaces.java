import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mikhail_alferov on 10.08.2017.
 */
public class Brqaces {
    static Map<Character, Character> mapBraceOpenKey = new LinkedHashMap<>();
    static Map<Character, Character> mapBraceCloseKey = new LinkedHashMap<>();
    static List<Character> braces = Arrays.asList('(', '{', '[', ')', '}', ']');

    static {
        mapBraceOpenKey.put('{', '}');
        mapBraceOpenKey.put('(', ')');
        mapBraceOpenKey.put('[', ']');
        mapBraceCloseKey.put('}', '{');
        mapBraceCloseKey.put(')', '(');
        mapBraceCloseKey.put(']', '[');
    }

    public static void main(String[] args) {
        String fraze = "(2( + 3x){bla, bla}()[]])";
        //String fraze = " ( { ) }";
        StringBuilder sb = new StringBuilder();
        char[] chars = fraze.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (braces.contains(chars[i])) {
                sb.append(chars[i]);
            } else sb.append("*");
        }
        char[] braceArray = sb.toString().toCharArray();
        findPair(braceArray, 0, braceArray.length);
        checkOrder(braceArray);


    }

    private static void findPair(char[] braceArray, int start, int end) {
        for (int i = start; i < end; i++) {
            if (braces.contains(braceArray[i]) && mapBraceOpenKey.get(braceArray[i])!=null) {
                char leftBrace = braceArray[i];
                char rightBrace = mapBraceOpenKey.get(leftBrace);
                Integer rightBracePos = findRightBrace(braceArray, leftBrace, rightBrace, i);
                if (rightBracePos == null) break;
                else {
                  findPair(braceArray,i+1,rightBracePos);
                }
            }
        }
    }

    private static Integer findRightBrace(char[] braceArray, char leftBrace, char rightBrace, int pos) {
        for (int i = braceArray.length - 1; i > pos; i--) {
            if (braces.contains(braceArray[i])) {
                char foundRightBrace = braceArray[i];
                if (foundRightBrace != rightBrace) {
                    System.out.println("cannot find pair for " + leftBrace + "at position " + pos);
                    return null;
                } else {
                    return i;
                }
            }
        }
        return null;
    }

    private static void checkOrder(char[] braceArray) {
        for (int i = 0; i < braceArray.length; i++) {
            if (i < braceArray.length - 1 && braces.contains(braceArray[i])) {
                char c = braceArray[i];
                char next = findNext(braceArray, i);
                if (next != '*') {
                    boolean cIsOpen = isOpen(c);
                    boolean nextIOpen = isOpen(next);
                    if (cIsOpen && !nextIOpen) {
                        boolean b = checkBraceTheSame(c, next);
                        if (!b) {
                            System.out.println("You miss brace " + mapBraceOpenKey.get(c) + " for " + c + " at " + i + "position");
                        }
                    }
                    if(!cIsOpen){
                        checkBeforeBraces(braceArray,i, c);
                    }
                }
            }

        }
    }

    private static void checkBeforeBraces(char[] braceArray, int i, char c) {
        if(i == 0) System.out.println("Brace" + c + " in position " + i + "is not appropriate");
        char openBrace = mapBraceCloseKey.get(c);

    }

    private static char findNext(char[] braceArray, int j) {
        for (int i = j + 1; i < braceArray.length; i++) {
            if (braceArray[i] != '*') return braceArray[i];
        }
        return '*';
    }

    private static boolean checkBraceTheSame(char c, char next) {
        char character = mapBraceOpenKey.get(c);
        return character == next;
    }

    private static boolean isOpen(char c) {
        switch (c) {
            case '{':
            case '(':
            case '[':
                return true;
            default:
                return false;
        }
    }

}
