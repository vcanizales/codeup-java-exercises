package Shapes;

public class Square extends Quadrilateral{
    protected double length;
    protected double width;

    public Square(double length, double width){
        super(length,width);
        this.length = length;
        this.width = width;
    }
    void setLength(double length){}

    void setWidth(double width){}
//    @Override
//    public double getPerimeter(){
//        return length * 4;
//    }
//
//    @Override
//    public double getArea(){
//        return length * width;
//    }
//    public Square(){};
//
//    public Square(double side){
//        super.setLength(side);
//        super.setWidth(side);
//    }
//
//    public double getArea() {
//        double side = this.length;
//        System.out.println("Area of a square");
//        return (double) Math.pow(side, 2);
//    }
//
//    public double getPerimeter() {
//        double side = this.width;
//        System.out.println("Perimeter of a square");
//        return side * 4;
//    }
}


