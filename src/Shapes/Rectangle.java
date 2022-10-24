package Shapes;

public class Rectangle extends Quadrilateral implements Measurable {


    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {
    }

    public double getLength() {
        return super.getLength();
    }


    @Override
    public void setWidth(double width) {
    }

    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
//    protected double length;
//
//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }
//
//    protected double width;
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    public Rectangle(){};
//
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea(){
//        return length*width;
//    }
//
//    public double getPerimeter(){
//        return (2*length) + (2*width);
//    }


