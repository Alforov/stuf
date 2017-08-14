import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Created by mikhail_alferov on 02.08.2017.
 */
public abstract class StreamsTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("#four #one #two #three", "#one #two", "La #one #four");
        Map<String, Long> collect = list.stream().map(it -> it.split(" ")).flatMap(Arrays::stream).filter(s -> s.startsWith("#")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(v1,v2)->v2, LinkedHashMap::new ));
        System.out.println(collect);
        //  list.stream().map(it -> it.split(" ")).flatMap(Arrays::stream).filter(s -> s.startsWith("#")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).forEach(System.out::print);
        //  System.out.println();
        // Supplier<LinkedHashMap<String,Long>> linkedHashMapTestLymd = LinkedHashMap::new;
        //  Map.Entry<String, Long> stringLongEntry = list.stream().map(it -> it.split(" ")).flatMap(Arrays::stream).filter(s -> s.startsWith("#")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().max(Map.Entry.<String, Long>comparingByValue()).orElse(null);
        //  System.out.println(stringLongEntry);
        //System.out.println(collect);

       /* Map<String, Long> map = list.stream().map(it -> it.split(" ")).flatMap(Arrays::stream).filter(s -> s.startsWith("#")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEach(System.out::println);*/
    }
}
