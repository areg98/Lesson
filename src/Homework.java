import java.util.Random;

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
    //https://www.w3resource.com/java-exercises/array/index.php
    //  18
    static int secondSmallest(int[] arr){
        return sort(arr)[arr.length - 2];
    }

    //Напишите класс, который генерирует серию из 100 случайных однозначных
    //неотрицательных чисел (цифр).
    //Класс должен подсчитать, сколько раз в этой серии встречалась каждая
    //цифра, и вывести на экран соответствующую информацию.
    static void randomNumbers(int n){
        Random random = new Random();
        int[] arr = new int[n];
        int[] counts = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0,10);
            if (i % 100 == 0) System.out.println();
            System.out.print("\u001B[32m" + arr[i] + " " + "\u001B[0m");
            for (int j = 0; j < 10; j++) {
                if (arr[i] == j) counts[j]++;
            }
        }

        System.out.println();
        for (int i = 0; i < counts.length; i++) {
            float tokos = (float) (counts[i] * 100) / n;
            System.out.println(i + ": " + counts[i] + " " + tokos + "%");
        }
        int max = counts[0], maxIndex = 0;
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] > max) {
                max = counts[i];
                maxIndex = i;
            }
        }
        System.out.println("\n" + "Max Number: " + maxIndex);
    }



    //Напишите метод, который получает в качестве параметра строку и возвращает
    //строку, составленную только из заглавных букв русского алфавита.
    //Например, для строки АБвrде 123ЖзИ метод возвратит АБЖИ.

    static String getUpperCases(String word){
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if ((int) word.charAt(i) >= 1040 && (int) word.charAt(i) <= 1071) result += word.charAt(i);
        }
        return result;
    }






        public static void main (String[]args){
            int[] arr1 = {5,28,62,8,6};
            sort(arr1);
            System.out.print("Sorted Array: ");
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i] + " ");
            }
            System.out.println();
            System.out.print("The second largest number: " + secondLargest(arr1) + "\n");
            System.out.print("The second smallest number: " + secondSmallest(arr1) + "\n");
            randomNumbers(10000);
            System.out.println(getUpperCases("АБвrде 123ЖзИ"));
        }
    }
