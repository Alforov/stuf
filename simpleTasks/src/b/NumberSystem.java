package b;

import java.util.Vector;

/**
 * Created by mikhail_alferov on 20.04.2017.
 */
public class NumberSystem {
    public static void main(String[] args) throws Exception {
        int hexa = 0xF12A;
        int octa = 0400;
        int binaryHexa =  0b0111_0000_0000;
        int binaryOcta =  0b100_000_000;
        byte b = 127;
        System.out.println(hexa);
        System.out.println(octa);
        System.out.println();
        Object x = new Vector().elements();
  /*      Method m = ClassLoader.class.getDeclaredMethod("findLoadedClass", new Array[]{String.class});
        m.setAccessible(true); m.invoke(t, "Stirng");
        System.out.println(aClass.getName());
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        TestSort o = (TestSort)aClass.newInstance();*/

     //   URL[] urls = ((URLClassLoader)cl).getURLs();

       /* for(URL url: urls){
            System.out.println(url.getFile());
        }*/
    }
}
