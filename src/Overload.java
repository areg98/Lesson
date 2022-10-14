public class Overload {

    void foo(){
        System.out.println('a');
    }
    void foo(char a){
        System.out.println(a);
    }
    char foo(char a, int b){
        return (a -= b);
    }
    char toUpperCase(char a){
        if (a >= 97 && a <= 122) {
            return (char)( a - 32);
        }
        else {
            return a;
        }
     }
    char[] toUpperCase(char[] a){
        char[] newArr = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            newArr[i] = toUpperCase(a[i]);
            }
        return newArr;
    }


    public static void main(String[] args) {
        Overload ov = new Overload();
        ov.foo();
        ov.foo('a');
        System.out.println(ov.foo('a', 32));
        System.out.println(ov.toUpperCase('A'));
        char[] arr = {'a','d','f','G','2'};
        char[] arr1 = ov.toUpperCase(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }


    }

}
