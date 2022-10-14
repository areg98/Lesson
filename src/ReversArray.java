public class ReversArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = arr[i] + arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i] - arr[arr.length - i - 1];
            arr[i] = arr[i] - arr[arr.length - i - 1];
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}