/**
 * Created by mikhail_alferov on 05.09.2017.
 */
public class ReturnThrow {
    public static void main(String[] args) {
        System.out.println(a());
    }

    private static Boolean a(){
        UpbsBiller upbsBiller =  new UpbsBiller();
        if(upbsBiller != null && upbsBiller.getMobile()){
            System.out.println("hello");
        }
        return upbsBiller != null && upbsBiller.getMobile();
    }
}
