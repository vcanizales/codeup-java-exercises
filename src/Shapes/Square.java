package Shapes;

public class Square extends Rectangle{
    public Square(){};

    public Square(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    public double getArea() {
        double side = this.length;
        System.out.println("Area of a square");
        return (double) Math.pow(side, 2);
    }

    public double getPerimeter() {
        double side = this.width;
        System.out.println("Perimeter of a square");
        return side * 4;
    }
}


