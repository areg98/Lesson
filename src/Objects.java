

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
        return a > b;
    }

    //Getting letters via ascii code

    static char[] getLetter(String lang) {
        int length;
        char firstLetter;
        switch (lang){
            case "en":
                length = 26;
                firstLetter = 'a';
                break;
            case "ru":
                length = 32;
                firstLetter = 'а';
                break;
            case "am":
                length = 39;
                firstLetter = 'ա';
                break;
            default:
                System.out.println("Wrong language");
                length = 0;
                firstLetter = 0;
        }
        char[] letters = new char[length];
        for (int i = 0; i < length; i++) {
            letters[i] = firstLetter;
            firstLetter++;
        }
        return letters;
    }

    //Method getting char array and return upper case letters

    static char[] toUpperCase(char[] arr){
        String lang;
        if ((int)arr[0] == 97) lang = "en";
        else if ((int)arr[0] == 1072) lang = "ru";
        else if ((int)arr[0] == 1377) lang = "am";
        else lang = "";
        char firstLetter;
        switch (lang){
            case "en":
                firstLetter = 'A';
                break;
            case "ru":
                firstLetter = 'А';
                break;
            case "am":
                firstLetter = 'Ա';
                break;
            default:
                System.out.println("Wrong language");
                return arr;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = firstLetter;
            firstLetter++;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(max(x, y));
        System.out.println(checkBoolean(true, 6.2));
        System.out.println(isFirstMax(x, y));

        char[] alphabet = getLetter("en");

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
