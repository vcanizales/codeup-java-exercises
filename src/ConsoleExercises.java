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
        System.out.printf("Your 3 words were:%n %s%n %s%n %s%n", word1, word2, word3);
        scanner.nextLine();
        System.out.println("Enter a sentence: ");
        String userSentence = scanner.nextLine();
        System.out.println("Your sentence was: " + userSentence + ".");

//        System.out.println("Enter length: ");
//        int userLength = Integer.parseInt(scanner.nextLine());
//        System.out.println("Enter width: ");
//        int userWidth = Integer.parseInt(scanner.nextLine());
//        System.out.println("The area of the room is " + (userLength*userWidth) + ".");
//        int perimeter = (userLength*2) + (userWidth*2);
//        System.out.printf("The perimeter of the room is %d.", perimeter);

        System.out.print("Enter length: ");
        double userLength = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter width: ");
        double userWidth = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter height: ");
        double userHeight = Double.parseDouble(scanner.nextLine());
        double area = userLength * userWidth;
        double perimeter = (userLength * 2) + (userWidth * 2);
        double volume = userHeight*userWidth*userLength;
        System.out.printf("The area of the room is %.2f.%n", area);
        System.out.printf("The perimeter of the room is %.2f.%n", perimeter);
        System.out.printf("The volume of the room is %.2f cubic feet.%n",volume);

//        1. Prompt the user to enter a favorite quote
//        - output the quote
//        - ask them to enter how many words are in the quote
//        - output the number they entered
//        - output if the number they entered indeed matched the number of words
        System.out.println("What's your favorite quote?: ");
        String userInput = scanner.next();
        scanner.nextLine();
        System.out.println("How many letters are in your quote?: ");
        String qtLength = scanner.next();
        scanner.nextLine();
        if (qtLength.length() == userInput.length()) {
            System.out.println("Yes that is the right length!");
        } else {
            System.out.println("Nope, that's not the right length.");
        }
    }
//        2. Prompt the user to enter a list of top three favorite foods separated by only spaces
//
//        - Use the printf() to output the three top foods with the format:
//        1. FirstFood
//        2. SecondFood
//        3. ThirdFood
//
//        3. Prompt the user to enter a grocery list of three items
//                - each item should only be separated by a comma (no spaces)
//        - you will need to use the .useDelimiter() method on your scanner object
//                - output the result as a comma-separated list using printf()


}
