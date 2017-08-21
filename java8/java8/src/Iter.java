import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by mikhail_alferov on 15.08.2017.
 */
public class Iter {
    public static void main(String[] args) {

        List copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.add("ds");
        ListIterator listIterator = copyOnWriteArrayList.listIterator();

        while (listIterator.hasNext()){
            Object next = listIterator.next();
            System.out.println(next);
            listIterator.remove();
            copyOnWriteArrayList.add(0);
        }


    /*    Map<String,String> premiumPhone = new ConcurrentHashMap<>();
        premiumPhone.put("Apple", "iPhone");
        premiumPhone.put("HTC", "HTC one");
        premiumPhone.put("Samsung","S5");

        Iterator iterator = premiumPhone.keySet().iterator();

        while (iterator.hasNext())
        {
            System.out.println(premiumPhone.get(iterator.next()));
            iterator.remove();

            premiumPhone.put("d","d");
            premiumPhone.put("Sony", "Xperia Z");
        }*/

    }
}
