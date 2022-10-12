import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.%n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int userNumber = scanner.nextInt();

        System.out.println("Enter 3 words: ");
        scanner.nextLine();
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.printf("Your 3 words were: %s, %s, %s.%n", word1, word2, word3);
        scanner.nextLine();
        System.out.println("Enter a sentence: ");
        String userSentence = scanner.nextLine();
        System.out.println("Your sentence was: " + userSentence + ".");

        System.out.println("Enter length: ");
        int userLength = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter width: ");
        int userWidth = Integer.parseInt(scanner.nextLine());
        System.out.println("The area of the room is " + (userLength*userWidth) + ".");
        int perimeter = (userLength*2) + (userWidth*2);
        System.out.printf("The perimeter of the room is %d.", perimeter);
    }
}
