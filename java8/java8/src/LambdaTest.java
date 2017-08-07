import jdk.nashorn.internal.ir.Block;

import java.math.BigDecimal;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by mikhail_alferov on 03.08.2017.
 */
public class LambdaTest {

    public static void main(String[] args) throws Exception {
        MultiFunction<String,Integer,BigDecimal,Character> f =
       /* Predicate<Integer> isOdd = n -> n % 2 != 0;
        System.out.println(isOdd.test(44));

        System.out.println("epay.terminal.".replaceFirst("\\.$", ""));
        BinaryOperator<Integer> sum = (x, y) -> x + y;
        System.out.println(sum.apply(3, 23));


        Callable<Integer> callMe = () -> 42;
        System.out.println(callMe.call());*/
    }

    private static void printNames(Object o) {
        System.out.println(o);
    }

    private static void printNames(Object o, Object o1) {
        System.out.println(o.toString() + o1.toString());
    }
}
