public class HanoiTower {
    public static void hano(int[] line1, int[] line2, int[] line3) {
//        int steps = (int) ((Math.pow(2, line1.length)) - 1);
//        System.out.println(steps);
        for (int i = 0; i < line3.length; i++) {
            if(line3[line3.length-1] != 0) return;
        }
        for (int i = line1.length - 1; i > 0; i--) {
            for (int j = 0; j < line2.length; j++) {
                if(line2[j] == 0 || line2[j] > line1[i]) {
                    line2[j] = line1[i];
                    line1[i] = 0;
                }
                else if (line3[j] == 0 || line3[j] > line1[i]){
                    line3[j] = line1[i];
                    line1[i] = 0;
                }
                break;
            }
        }

        for (int i = line2.length - 1; i > 0; i--) {
            for (int j = 0; j < line1.length; j++) {
                if(line1[j] == 0 || line1[j] > line2[i]) {
                    line1[j] = line2[i];
                    line2[i] = 0;
                }
                else if (line3[j] == 0 || line3[j] > line2[i]){
                    line3[j] = line2[i];
                    line2[i] = 0;
                }
                break;
            }
        }
//        hano(line2, line1, line3);
    }

    public static void main(String[] args) {
        int n = 3;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] arr3 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = n-i;
            arr2[i] = 0;
            arr3[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println("\n\n");

        hano(arr1,arr2,arr3);


        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
