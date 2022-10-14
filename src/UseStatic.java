import java.util.ArrayList;
import java.util.List;

class UseStatic {
    static int a = 3;
    static int b;
    private static int count = 0;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        System.out.println("static block initialised");
        b = a * 4;
    }

    UseStatic() {
        count++;
    }

    public static int getCount() {
        return count;
    }


    public static void main(String[] args) {
        meth(42);
        UseStatic useStatic = new UseStatic();
        UseStatic useStatic1 = new UseStatic();
        UseStatic useStatic2 = new UseStatic();
        UseStatic useStatic3 = new UseStatic();
        System.out.println(getCount());


    }
}
