/**
 * Created by mikhail_alferov on 03.08.2017.
 */
@FunctionalInterface
public interface TestLymd<A> {
    A test(A t);
    boolean equals(Object obj);

}
