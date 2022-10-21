package Shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());

        Measurable myShape = new Rectangle(9, 10);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        System.out.println("---------------------------");
        myShape = new Square(4, 4);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

    }
}
