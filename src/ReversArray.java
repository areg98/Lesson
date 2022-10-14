public class ReversArray {

    static  public void reversArray(int [] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = arr[i] + arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i] - arr[arr.length - i - 1];
            arr[i] = arr[i] - arr[arr.length - i - 1];
        }
    }
    static public void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        reversArray(myArray);
        printArray(myArray);
    }
}