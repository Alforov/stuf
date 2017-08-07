import java.util.function.Function;

/**
 * Created by mikhail_alferov on 07.08.2017.
 */
@FunctionalInterface
public interface MultiFunction<A,B,C,D> {
    Function<A,B> test(Function<A,B> f1, Function<C,D> f2);
}
