/**
 * Created by mikhail_alferov on 21.08.2017.
 */
public class A extends B{


    public static void show(){

        System.out.println("Static method called");
    }

    public static void main(String[] args)  {
        A obj = null;
        ((B)obj).show();

    }
}