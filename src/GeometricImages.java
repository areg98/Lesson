public class GeometricImages {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int space;
            space = 5 - i;
            for (int j = 0; j < space; j++) {
                if (j == space) System.out.print("/");
                else System.out.print(" ");
            }
            for (int j = 0; j <= 20 - space; j++) {
                if (i == 1 && j != 0 && j != 20 - space) System.out.print("-");
                else if (i == 5 && j > 0 && j <= 20 - space - 5) System.out.print("-");
                else if (j == 0 || j == 20 - space-i ) System.out.print("/");
                else if (j == 20 - space ) System.out.print("|");
                else System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j <= 20; j++) {
                if (j == 0 || j == 20 || j == 20 -5) System.out.print("|");
                else System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            int space;
            space = i;
            for (int j = 0; j <= 20-space; j++) {
                if (i == 5 && j != 0 && j != 20 - space) System.out.print("-");
                else if (j == 0 || j == 20 - 5 && i != 5 ) System.out.print("|");
                else if (j == 20-space) System.out.print("/");
                else System.out.print("*");

            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }




    }
}
