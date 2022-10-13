import java.util.Arrays;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 100;
//        do {
//            System.out.println(i);
//            i = i -5;
//        } while (i >= -10 && i <= 100);

//        for(int i = 100; i >= -10 && i <= 100; i-=5){
//            System.out.println(i);
//        }


//        long i = 2;
//        do {
//            System.out.println(i);
//            i = i*i;
//        } while (i <= 1000000);

//        for(long i = 2; i <= 1000000; i*=i){
//            System.out.println(i);
//        }

//        for(int i = 1; i <= 100; i++){
//            System.out.println(i);
//        }
//
//        for(int i = 1; i <= 100; i++){
//            if((i % 3) == 0) {
//                System.out.println("Fizz");
//            } else if ((i % 5) == 0) {
//                System.out.println("Buzz");
//            } else if ((i % 15) == 0) {
//                System.out.println("FizzBuzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        Scanner sc = new Scanner(System.in);
        String choice = "yes";

        while(choice.equalsIgnoreCase("yes")) {
            System.out.println("Enter an integer: ");
            int userInt = sc.nextInt();

            System.out.println("Number" + " | " + "Squared" + " | " + "Cubed");
            System.out.println("------" + " | " + "------ " + " | " + "------");

            for (int i = 1; i <= userInt; i++) {
                    int numberSquared = i * i;
                    int numberCubed = i * i * i;
                    String message = "\n" + i + "  |  " + numberSquared + "  |  " + numberCubed;

                    System.out.println(message);
                }
                System.out.println("Continue? (yes/no): ");
                choice = sc.next();
                System.out.println();
            }
        }
    }

