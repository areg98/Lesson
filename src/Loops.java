public class Loops {
    public static void main(String[] args) {


        System.out.println("All even numbers in range of 100");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("All odd numbers in range of 100");
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println("all numbers divisible by 3 in range of 100");
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        long factorial;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            factorial = 1;
            sum += i;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.println("Fibonacci of " + i + " is: " + factorial);
        }
        System.out.println("Sum of 1-100 numbers is: " + sum);

        //For in for

        for (int i = 0; i < 11; i++) {
            System.out.println("i = " + i);
            System.out.println("######################");
            for (int j = 0; j < 11; j++) {
                System.out.println("j = " + j);
            }
            System.out.println("######################");
        }

        //While in for

        int j;
        for (int i = 0; i < 11; i++) {
            System.out.println("i = " + i);
            System.out.println("######################");
            j = 0;
            while (j < 11){
                System.out.println("j = " + j);
                j++;
            }
            System.out.println("######################");
        }

        //For in While

        int i = 0;
        while (i < 11){
            System.out.println("i = " + i);
            System.out.println("######################");
            for (j = 0; j < 11; j++) {
                System.out.println("j = " + j);
            }
            System.out.println("######################");
            i++;
        }


    }
}
