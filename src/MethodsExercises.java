import java.util.Scanner;
import java.lang.Math;

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
// #2 //

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d:%n", min, max);
        int value = sc.nextInt();

        if (value <= 10 && value >= 1) {
            System.out.println("GOOD JOB!");
            ;
        } else {
            System.out.println("NOPE THAT'S NOT IT!");
        }
        return value;
    }

//    public static void main(String[] args) {
//        long userInput = factorial();
//    }

//********************************************************************//
// # FACTORIAL 3 //

//    public static int getFactorial() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number between 1-10: ");
//            int value = sc.nextInt();
//            int fact = 1;
//
//            for (int i = value; i > 0; i++){
//            System.out.println(i);
////            System.out.printf("%d! = %d x %d\t\t\t= %d%n", value,i,i,value*i);
//                fact = fact * 1;
//        }
//        return fact;
//    }
//
//public static void main(String[] args) {
//    String choice = "yes";
//
//    do {
//            System.out.println(getFactorial());
//            System.out.println("Would you like to enter another number?: (yes/no)");
//            Scanner sc = new Scanner(System.in);
//            choice = sc.next();
//        }
//        while (choice.equalsIgnoreCase("yes"));
//}
//
//
////        Scanner sc = new Scanner(System.in);
////        System.out.println("Enter a number: ");
////        int num = sc.nextInt();
////
////        for (int i=0; i <= 10; i++){
////            System.out.printf("%d! = %d x %d\t\t\t= %d%n", num,num,i,num*i);
//////            System.out.println(num +"! = " + num + " x " + i + "=" + (num*i));
//    }

//public static long calculateFactorial(){
//    int userInput = getInteger(1, 10);
//    while (true) {
//        long factorial = 1;
//        for (int i = 1; i <= userInput; i++) {
//            factorial = factorial * 1;
//        }
//        return factorial;
//    }
//}
//
//
//public static long factorial() {
//
//}
//        System.out.println("Would you like to calculate another factorial? (y/n");
//        String userChoice = new Scanner(System.in).next();
//        if (userChoice.equalsIgnoreCase("no")) {
//            break;
//        } else {
//            System.out.println("Program ended");
//        }
//    return getInteger(int min, int max);
//}


//*******************************************************//
//#4 ROLLING DICE //

    public static long generateRandomNumber(int max){
        return (int)Math.ceil(Math.random() * max);
}

    public static void roll() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many sides do the dice have?");
        byte numberOfSides = sc.nextByte();
        System.out.printf("Your dice have %d sides.%n", numberOfSides);

        //Roll the dice
        System.out.println("Do you want to roll the dice? y/n");
        String userChoice = sc.next();
        while(userChoice.equalsIgnoreCase("y")) {
            System.out.println("You rolled the dice!");
            System.out.printf("You rolled %d and %d%n", generateRandomNumber(numberOfSides), generateRandomNumber(numberOfSides));

            System.out.println("Do you want to roll the dice again?");
            userChoice = sc.next();
        }
    }

    public static void main(String[] args) {
        roll();
    }
}





