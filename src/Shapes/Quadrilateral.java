package Shapes;


public abstract class Quadrilateral extends shape implements Measurable {

    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    abstract void setLength(double length);

    abstract void setWidth(double width);
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getPerimeter() {
        return length * 4;
    }

    public double getArea() {
        return length * width;
    }
//    abstract void setLength(double length);
//    abstract void setWidth(double width);

}



