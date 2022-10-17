import java.sql.SQLOutput;
import java.util.Scanner;

public class MethodsExercises {

    public static int addition(int x, int y) {
        return x + y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static int division(int x, int y) {
        return x / y;
    }

    public static int modulus(int x, int y) {
        return x % y;
    }

//********************************************************************//
// Factorial //

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d:%n", min, max);
        int value = sc.nextInt();

        if (value <= 10 && value >= 1) {
            System.out.println("GOOD JOB!");;
        } else {
            System.out.println("NOPE THAT'S NOT IT!");
        }
        return value;
    }

    public static void main(String[] args) {
        int userInput = getInteger(1, 10);
    }

//    public static int factorial(int num) {
//        for (int i = 1; i <= num; i++) {
//            return factorial(num) = num * i;
//
//        }
//    }

//        if (num >= 1)
//            return num * factorial(num - 1);
//        else
//            return 1;


//        int i = sc.nextInt();
//        int fact = 1;
//
//
//        for (i = 1; i <= fact; i++) {
//        }
//        return fact = fact * i;
//        System.out.println("Factorial of " + i + "is " + fact);


//    public static void main(String[] args) {
//        do {
//            System.out.println(getFactorial());
//            System.out.println("Would you like to enter another number?: (yes/no)");
//            Scanner sc = new Scanner(System.in);
//            String choice = sc.next();
//        }
//        while (choice.equalsIgnoreCase("yes"));


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int num = sc.nextInt();
//
//        for (int i=0; i <= 10; i++){
//            System.out.printf("%d! = %d x %d\t\t\t= %d%n", num,num,i,num*i);
////            System.out.println(num +"! = " + num + " x " + i + "=" + (num*i));
    }


//    Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number between 1-10: ");
//    int value = sc.nextInt();
//    int fact = 1;
//
//        for (int i = 1; i > 0; i--) {
//        System.out.println(i);
//        fact = fact * 1;
//    }
//        return fact;
//}

