public class Stack {
    int stck1[] = new int[100];
    int stck[];
    int n = 0, tos, temp;

    Stack() {
        tos = -1;
        temp = 0;
    }

    void push(int item) {
        if (tos == stck1.length - 1) {
            System.out.println("Stack is full");
        } else {
            stck1[++tos] = item;
            n++;
            stck = new int[n];
            for (int i = temp, j = 0 ; i < stck.length+temp; i++, j++) {
                stck[j] = stck1[i];
            }
        }
    }

    int pop() {

        if (tos < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            n--;
            stck = new int[n];
            for (int i = 0; i < stck.length; i++) {
                stck[i] = stck1[i];
            }
            return stck1[tos--];
        }
    }

    // First input, first output.

    int shift() {
        if (temp > stck1.length - 1) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            n--;
            stck = new int[n];
            for (int i = temp, j = 0; i < stck.length; i++, j++) {
                stck[j] = stck1[i];
            }
            return stck1[++temp];
        }
    }

    boolean isContain(int x){
        for (int i = 0; i < stck.length; i++) {
            if (x == stck[i]) return true;
        }
        return false;
    }

}

class TestStack {
    public static void main(String[] args) {
        Stack MyStack = new Stack();

        for (int i = 1; i <= 25; i++) {
            MyStack.push(i);
        }
        MyStack.shift();
//        MyStack.push(2);
//        MyStack.pop();
//        MyStack.push(3);
        System.out.println(MyStack.isContain(7));


        for (int i = 0; i < MyStack.stck.length; i++) {
            System.out.print(MyStack.stck[i] + " ");
        }

    }
}