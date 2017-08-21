import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by mikhail_alferov on 17.08.2017.
 */
public class Tree {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        map.put("1", "value1");
        System.out.println(map.put(null, "value"));


    }
}
