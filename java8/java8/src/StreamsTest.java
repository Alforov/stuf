import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by mikhail_alferov on 02.08.2017.
 */
public abstract class StreamsTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("#one #two #three", "#one #two", "La #one");
        Map<String, Long> map = list.stream().map(it -> it.split(" ")).flatMap(Arrays::stream).filter(s -> s.startsWith("#")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
