

public class Objects {
    public static int x = 7;
    public static int y = 6;

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    static int checkBoolean(boolean b, double x) {
        return b ? 0 : (int) x;
    }

    static boolean isFirstMax(int a, int b) {
        return a >= b;
    }

    //Getting letters via ascii code

    static char[] getLetter() {

        char[] letters = new char[26];
        char letter = 'a';

        for (int i = 0; i < 26; i++) {
            letters[i] = letter;
            letter++;
        }
        return letters;
    }

    //Method getting char array and return upper case letters

    static char[] toUpperCase(char[] arr){
        char letter = 'A';
        for (int i = 0; i < arr.length; i++) {
            arr[i] = letter;
            letter++;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(max(x, y));
        System.out.println(checkBoolean(true, 6.2));
        System.out.println(isFirstMax(x, y));

        char[] alphabet = getLetter();
        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
        }

        System.out.println();

        char [] alphabetUpperCase = toUpperCase(alphabet);
        for (int i = 0; i <alphabetUpperCase.length; i++) {
            System.out.print(alphabetUpperCase[i] + " ");
        }
    }
}
