import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int myFavoriteNumber = 14;
        System.out.println(myFavoriteNumber);

        String myString = "My name is Valeria";
        System.out.println(myString);

        double myNumber = (float) 3.14;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//
//        int y = 5;
//        System.out.println(++y);
//        System.out.println(y);

//        class = "hi";

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

        String three = "three";

//        int three = (int) "three";

//        int x = 4;
//        System.out.println(x += 5);

//        int x = 3;
//        int y = 4;
//        System.out.println(y *= x);

        int x = 10;
        int y = 2;
        System.out.println(x /= y);
        System.out.println(y -= x);
        //in one line y -= (x / y);

//        String name = "codeup";
//        System.out.printf("Hello there, %s. Nice to see you.%n", name);

        String greeting = "Salutations";
        String name = "codeup";
        System.out.printf("%s, %s!", greeting, name);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.next();

        System.out.println("You entered: --> \"" + userInput + "\" <--");


    }
}
