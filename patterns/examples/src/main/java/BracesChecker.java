import java.util.*;

/**
 * Created by root1 on 13.08.17.
 */
public class BracesChecker {
    static Map<Character,Character> rightBracesKey = new HashMap<>();
    static List<Character> openBraces = Arrays.asList('{','(');
     static {
         rightBracesKey.put('}','{');
         rightBracesKey.put(')','(');
     }

    public static void main(String[] args) {
        String s= "({gdfg}()fdg(){})";
         LinkedList<Character> braces = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if(openBraces.contains(c)){
                braces.add(c);
            }else if(rightBracesKey.get(c)!=null){
              if( !braces.getLast().equals(rightBracesKey.get(c))) throw  new RuntimeException("Not valid");
            else braces.removeLast();
            }
        }
         if(braces.size()>0){
            throw new RuntimeException("notValid");
         }else System.out.println("VAlid");

    }
}
