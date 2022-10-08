public class Homework {


    //https://www.w3resource.com/java-exercises/array/index.php
    // #1
    static int[] sort(int[] arr) {
        int num;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    num = arr[j];
                    arr[j] = arr[i];
                    arr[i] = num;
                }

            }
        }
        return arr;
    }

    //https://www.w3resource.com/java-exercises/array/index.php
    //# 17
    static int secondLargest(int[] arr){
        return sort(arr)[1];
    }



        public static void main (String[]args){
            int[] arr1 = {5,28,62,8,6};
            sort(arr1);
            System.out.print("Sorted Array: ");
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + " ");
            }
            System.out.println();
            System.out.print("The second largest number: " + secondLargest(arr1));
        }
    }
