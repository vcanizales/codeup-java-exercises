import java.util.Scanner;

public class ControlStatementsLecture {
    //Statements
    int myInteger = 20;

    public static void main(String[] args) {
//        int x = 20;
//        if (x == 5) {
//            System.out.println("x is 5");
//        } else if (x > 5 && x < 15) {
//            System.out.println("x is between 5 and 15");
//        } else {
//            System.out.println("Yo no se");
//        }
//
//
//        String customerChoice;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("What flavor do you want?");
//        customerChoice = sc.next();
//
//        switch (customerChoice) {
//            case "vanilla" -> System.out.println("One vanilla coming right up");
//            case "chocolate" -> System.out.println("chocolate coming right up");
//            case "strawberry" -> System.out.println("strawberry coming right up");
//            default -> System.out.println("We don't have that");
//        }

        boolean existence = true;
        if (existence) System.out.println("Yes");


        int c = 0, d = 100, e = 50;
        if (c == 1 && e++ < 100) {

        }
        System.out.println("e = " + e);

        int z = 2;
        int y = 2;
        if(z == 2 | y == 2) System.out.println("This is true");

        int i = 1;
        System.out.println("The loop hasnt started yet. The value of i is " + i);
//        while(i < 10){
//            System.out.println("Now I'm in the loop. i has not incremented yet and its value is " + i);
//            i++;
//            System.out.println("I'm still in the loop. i has incremented and its value is " + i);
//        }
//        do {
//            System.out.println("Now I'm in the loop. i has not incremented yet and its value is " + i);
//            i++;
//        } while (i < 10);
//        System.out.println("The loop has ended because the conditional has tested false. The value of i is " + i);

        for(i=0; i < 10; i++){
            System.out.println(i);
        }
    }
}

