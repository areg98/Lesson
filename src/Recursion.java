public class Recursion {
    static int fibonacci(int n) {
        int result;
        if (n == 0 || n == 1) {
            return n;
        }
        else {
            result = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return result;

    }

    static int factorial(int x){
        if (x == 1) return 1;
        return x * factorial(x-1);
    }

    static int sumOfXNumbers(int x){
        if (x == 1) return 1;
        return x + sumOfXNumbers(x-1);
    }


    public static void main(String[] args) {
        System.out.println(fibonacci(10));
        System.out.println(factorial(5));
        System.out.println(sumOfXNumbers(3));
    }
}
