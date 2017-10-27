package generics;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by mikhail_alferov on 26.10.2017.
 */
public class A<D extends O&List<D>> {

    public void check(D d) {
        d.test();
    }

    public void checkO(O d) {
        d.test();
    }
}
