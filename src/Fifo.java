 class Fifo {
    int[] stack;
    int temp;

    Fifo(int n){
        stack = new int[n];
        temp = -1;

    }
    void push(int item){
        if (temp == stack.length - 1){
            System.out.println("Stack is full");
        }
        else stack[++temp] = item;
    }

     int pop(){
        if (temp < 0){
            System.out.println("Stack underflow");
            return 0;
        }
        else {
            return stack[temp--];
        }
    }

}
class TestFifo {
    public static void main(String[] args) {
        Fifo MyStack = new Fifo(5);
        for (int i = 1; i <= MyStack.stack.length; i++) {
            MyStack.push(i);

        }
        for (int i = 0; i < MyStack.stack.length; i++) {
            System.out.print(MyStack.stack[i] + " ");
        }
        System.out.println(MyStack.pop());
        System.out.println(MyStack.pop());
        System.out.println(MyStack.pop());

    }
}