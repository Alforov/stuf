package inheritance;

import java.math.BigDecimal;

/**
 * Created by mikhail_alferov on 05.09.2017.
 */
public class D extends C {
    @Override
    public synchronized BigDecimal cc() {
        try {
            super.cc();
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public String toString() {
        return "{D}";
    }
}
