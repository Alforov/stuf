import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mikhail_alferov on 11.09.2017.
 */
public class Int {

    public static void main(String[] args) {
        int order = 0;
        for (int i = 0; i<10;i++){
        test(order++);}

    }

    private static void test(int i) {
        System.out.println(i);
    }
}
