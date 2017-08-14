import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by mikhail_alferov on 03.08.2017.
 */
public class LambdaTest {

    public static void main(String[] args) throws Exception {
        Predicate<String> filterCustom = LambdaTest::filter;
        Function<String,String> map = LambdaTest::map;
        List<String> strings = Arrays.asList("one", "two", "three");
        List<String> collect = strings.stream().filter(filterCustom).map(map).collect(Collectors.toList());
        System.out.println(collect);
    }

    public static Boolean filter(String s) {
        return !"two".equals(s);
    }


    public static String map(String s){
        return s.substring(1);
    }

}
