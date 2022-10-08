public class SomeThing {
    static boolean isOdd(int num) {
        return (num % 2 == 1);
    }

    static void printOddNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isOdd(arr[i])) System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 81, 50, 3, 7, 6, 9, 14, 45};
        printOddNumbers(arr1);
    }
}
