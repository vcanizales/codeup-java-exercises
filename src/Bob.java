import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Write a message: ");
//        String message = sc.nextLine();
        String choice;

        do {
            System.out.println("Write a message: ");
            choice = sc.nextLine();
//            System.out.println(choice);
            char lastMark = choice.charAt(choice.length() - 1);
//            System.out.println(lastMark);
            switch (lastMark) {
                case '?':
                    System.out.println("Sure");
                    break;
                case '!':
                    System.out.println("Whoa, chill out!");
                    break;
                case ' ':
                    System.out.println("Fine. Be that way!");
                    break;
                default:
                    System.out.println("Whatever");
            }
            if (lastMark == ' ') break;
        }
        while (choice.equalsIgnoreCase(choice));
    }
}

//        while (choice.equalsIgnoreCase(message)) {

