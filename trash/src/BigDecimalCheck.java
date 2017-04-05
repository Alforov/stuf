import java.math.BigDecimal;

/**
 * Created by mikhail_alferov on 05.04.2017.
 */
public class BigDecimalCheck {
    public static void main(String[] args) {
        long l = 66;
        System.out.println(BigDecimal.valueOf(l).equals(new BigDecimal(66)));
        BigDecimal result = null;
        System.out.println("result " + result);
    }
}
