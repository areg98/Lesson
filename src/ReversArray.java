public class ReversArray {

    static  public void ReversArray(int [] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = arr[i] + arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i] - arr[arr.length - i - 1];
            arr[i] = arr[i] - arr[arr.length - i - 1];
        }
    }

    public static void main(String[] args) {
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        ReversArray(myArray);
        for (int x : myArray) {
            System.out.print(x + " ");
        }
    }
}