package classloading;

import java.sql.Connection;

public class B extends A{
    static {
        System.out.println("static B");
    }
}
