import java.util.Random;

public class Arrays {
    public static void main(String[] args) {

        Random random = new Random();


        //Sorting arrays : ascending, descending
        int[] arr = new int[10];
        int num = arr[0];
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(10, 100);
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (arr[i] < arr[j]) {
                    num = arr[j];
                    arr[j] = arr[i];
                    arr[i] = num;
                }

            }
        }
        System.out.println();
        System.out.print("Ascending order: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (arr[i] > arr[j]) {
                    num = arr[j];
                    arr[j] = arr[i];
                    arr[i] = num;
                }

            }
        }
        System.out.println();
        System.out.print("Descending order: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        // Calculating sum of diagonal lines for matrix
        int h = 3, l = 3, sum = 0;
        int nums[][] = new int[h][l];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                nums[i][j] = random.nextInt(10, 100);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < h; i++) {
            if (h % 2 == 1 && i == h/2){
                sum += nums[i][i];
            }
            else {
                sum += nums[i][i] + nums[i][l-i-1];
            }
        }

        System.out.println();
        System.out.println("Sum of diagonal lines: " + sum + "\n");
        //Sorting matrix: ascending, descending


        int[] newArr = new int[h * l];
        int temp = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                newArr[temp++] = nums[i][j];
            }
        }
        for (int i = 1; i < newArr.length; i++) {
            for (int j = 0; j < newArr.length; j++) {
                if (newArr[i] < newArr[j]) {
                    num = newArr[j];
                    newArr[j] = newArr[i];
                    newArr[i] = num;
                }
            }
        }
        temp = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                nums[i][j] = newArr[temp++];
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sorted matrix in ascending order");
    }
}
