import java.util.Scanner;

public class TryCatchExamples {
    public static void main(String[] args) {

//        try{
//            int[] a = {4, 5, 1};
//            System.out.println(a[0]);
//        } catch(Exception e){
//            System.out.println("An exception happened.");
//        }

//        Scanner scan = new Scanner(System.in);
//        System.out.println("What's your favorite number?");

//        try{
//            int n = scan.nextInt();
//            System.out.println(n);
//        } catch(Exception e){
//            System.out.println("Sorry, please enter a number.");
//        }



        try{
            int[] a = {1};
            System.out.println(a[1]);
        } catch (NullPointerException e){
            System.out.println("Your array is null.");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Your index is out of bounds.");
        } catch (Exception e){
            System.out.println("Something else went wrong!");
        }
    }
}
