package Shapes;


public abstract class Quadrilateral implements Measurable {

    protected int length;
    protected int width;

    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
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

         abstract void setLength(int length);

         abstract void setWidth(int width);
}



