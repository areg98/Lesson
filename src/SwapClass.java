public class SwapClass {

    int i,j;

    SwapClass(int i, int j){
        this.i = i;
        this.j = j;
    }

    void swap(SwapClass ob){
        ob.i = ob.i + ob.j;
        ob.j = ob.i - ob.j;
        ob.i = ob.i - ob.j;

    }

    public static void main(String[] args) {
        SwapClass swop = new SwapClass(5,7);
        System.out.println("Before method " + swop.i + " " + swop.j);

        swop.swap(swop);
        System.out.println("After Method " + swop.i + " " + swop.j);
    }
}
