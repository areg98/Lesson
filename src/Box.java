 class Box {
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

//    void setWidth(double width){
//        this.width = width;
//    }
//    void setHeight(double height){
//        this.height = height;
//    }
//    void setDepth(double depth){
//        this.depth = depth;
//    }
    double volume(){
        return this.width * this.height * this.depth;
    }

    void foo(){
        System.out.println(this.volume());
    }

}
class BoxDemo{
    public static void main(String[] args) {
        Box box1 = new Box(2.1, 5, 6.1);
        box1.foo();

    }


}
