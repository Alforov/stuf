import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by mikhail_alferov on 16.08.2017.
 */
public class ArrayListVSLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i =0; i<10000 ; i++){
            arrayList.add(i);
            linkedList.add(i);
        }
        speed(linkedList);



    }

    private static void speed(List<Integer> linkedList) {
        long l = System.currentTimeMillis();
        for (Iterator i = linkedList.iterator(); i.hasNext(); ) {
            Integer next = (Integer) i.next();
            Integer d = next +1;
            System.out.println(d);
        }
        long l1 = System.currentTimeMillis();
        for (int i=0, n=linkedList.size(); i < n; i++){
            Integer integer = linkedList.get(i);
            Integer d = integer +1;
            System.out.println(d);
        }
        long l2 = System.currentTimeMillis();


        System.out.println(l);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l1-l + " iterator");
        System.out.println(l2-l1 + " get");
    }
}
