public class MatrixInMethod {
    static int foo(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= max) max = arr[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] f = {11, 8, 52, 95, 2};
        System.out.println(foo(f));
    }
}
