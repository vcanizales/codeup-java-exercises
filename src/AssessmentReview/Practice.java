package AssessmentReview;

import java.util.Scanner;

public class Practice {

    static Scanner sc = new Scanner(System.in);

    public static int subtractTen(){
        System.out.println("Enter an integer: ");
        int value = sc.nextInt();
        return value - 10;
    }
    public static void main(String[] args) {
        System.out.println(subtractTen());
    }
}
