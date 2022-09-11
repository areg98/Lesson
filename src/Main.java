import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        //primitive types

        byte b1 = 2;
        byte b2 = -128;
        byte b3 = 127;
        short s1 = 2536;
        short s2 = 25633;
        short s3 = 215;
        int i1 = 15785;
        int i2 = 235468845;
        int i3 = 2125555;
        long l1 = 372035526555555L;
        long l2 = 035526555555L;
        long l3 = 5156555555L;
        float f1 = 0.125635555444666554465f;
        float f2 = 2545454.444666554465f;
        float f3 = 515451.125635555444666554465f;
        double d1 = 2555.256454444;
        double d2 = 55.256454444;
        double d3 = 1025.5444256454444;
        char ch1 = 89;
        char ch2 = 'Y';
        char ch3 = '%';
        boolean t = true;
        boolean f = false;

        // byte
        System.out.println("\u001B[31m" + "b1 is: " + b1 + "\u001B[0m");
        System.out.println("\u001B[34m" + "b2 is: " + b2 + "\u001B[0m");
        System.out.println("\u001B[33m" + "b3 is: " +  b3 + "\u001B[0m");
        System.out.println();
        // short
        System.out.println("\u001B[31m" + "s1 is: " + s1 + "\u001B[0m");
        System.out.println("\u001B[34m" + "s2 is: " + s2 + "\u001B[0m");
        System.out.println("\u001B[33m" + "s3 is: " + s3 + "\u001B[0m");
        System.out.println();
        // int
        System.out.println("\u001B[31m" + "i1 is: " + i1 + "\u001B[0m");
        System.out.println("\u001B[34m" + "i2 is: " + i2 + "\u001B[0m");
        System.out.println("\u001B[33m" + "i3 is: " + i3 + "\u001B[0m");
        System.out.println();
        // long
        System.out.println("\u001B[31m" + "l1 is: " + l1 + "\u001B[0m");
        System.out.println("\u001B[34m" + "l2 is: " + l2 + "\u001B[0m");
        System.out.println("\u001B[33m" + "l3 is: " + l3 + "\u001B[0m");
        System.out.println();
        // float
        System.out.println("\u001B[31m" + "f1 is: " + f1 + "\u001B[0m");
        System.out.println("\u001B[34m" + "f2 is: " + f2 + "\u001B[0m");
        System.out.println("\u001B[33m" + "f3 is: " + f3 + "\u001B[0m");
        System.out.println();
        // double
        System.out.println("\u001B[31m" + "d1 is: " + d1 + "\u001B[0m");
        System.out.println("\u001B[34m" + "d2 is: " + d2 + "\u001B[0m");
        System.out.println("\u001B[33m" + "d3 is: " + d3 + "\u001B[0m");
        System.out.println();
        // char
        System.out.println("\u001B[31m" + "ch1 is: " + ch1 + "\u001B[0m");
        System.out.println("\u001B[34m" + "ch2 is: " + ch2 + "\u001B[0m");
        System.out.println("\u001B[33m" + "ch3 is: " + ch3 + "\u001B[0m");
        System.out.println();
        // boolean
        System.out.println("\u001B[31m" + "t is: " + t + "\u001B[0m");
        System.out.println("\u001B[34m" + "f is: " + f + "\u001B[0m");
        System.out.println("\u001B[33m" + "that's all !" + "\u001B[0m");
    }
}
