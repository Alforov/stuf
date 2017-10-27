/**
 * Created by mikhail_alferov on 21.08.2017.
 */
public class A extends B{

    @Override
    public Integer show() throws Throwable {
        return 1;
    }

    public static void main(String[] args) throws Throwable {
        A a = new A();
       a.foo(null);

    }

    public void foo(Integer s) {
        System.out.println("Integer");
    }

  private strictfp void foo() {
        System.out.println("Integer");
    }

    public void foo(char b){
        System.out.println("two");
    }
}