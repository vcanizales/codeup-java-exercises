import java.util.Scanner;

public class MethodsExercises {

    public static int addition(int x, int y){
        return x+y;
    }

    public static int subtraction(int x, int y){
        return x-y;
    }

    public static int multiplication(int x, int y){
        return x*y;
    }

    public static int division(int x, int y) {
        return x/y;
    }

    public static int modulus(int x, int y) {
        return x%y;
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d:%n", min, max);
        int value = sc.nextInt();

        if (value <= 10 && value >= 1) {
            return getInteger(min, max);
        } else {
            System.out.println("NOPE THAT'S NOT ETT!");
            return value;
        }
    }

    public static void main(String[] args) {
        getInteger(1, 10);
    }
}
