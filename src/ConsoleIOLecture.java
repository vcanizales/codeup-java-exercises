import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userNumber = Integer.parseInt(scanner.nextLine());
        System.out.printf("Your number was: %d%n", userNumber);
        System.out.print("Enter something: ");
//        scanner.nextLine();
        String userInput = scanner.nextLine();
        System.out.printf("You word was %s.%n", userInput);
        System.out.println("Enter another word: ");
        String secondSentence = scanner.nextLine();
        System.out.printf("You word was %s.%n", secondSentence);












//        System.out.println("You entered: -->\"" +userInput + "\"<--");
//        System.out.printf("You entered %s%n", userInput);
//        String cohort = "Weywot";
//        String timeOfDay = "morning";
//        byte week = 10;
//        float someNumber = 123.456F;
//        System.out.printf("Good, %s %s! %n", timeOfDay, cohort);
//        System.out.printf("This is the %dth week of %s cohort.", week, cohort);
//        System.out.println("Will this be on a separate line?");
//        System.out.println("Valeria");
//        System.out.printf("The number is %-11.2f%n", someNumber);


    }
}
