import java.util.Scanner;

public class StringsLecture {
    public static void main(String[] args) {
        String javier = "Javier";

        //A way to turn a string into an internal address
        //Internal Address = value of item within computer's memory
        System.out.println(Integer.toHexString(System.identityHashCode(javier)));

        String alsoJavier = "Javier";

        //Despite being different variables, they are both referred to the same place in memory
        //Would not be the case when normal objects are created
        System.out.println(Integer.toHexString(System.identityHashCode(alsoJavier)));

        javier = javier + " Ruedas";
        alsoJavier = javier;

        //Since the string was modified^^^, the internall address will change
        System.out.println(Integer.toHexString(System.identityHashCode(javier)));

        System.out.println(alsoJavier);
        System.out.println(javier);
        System.out.println(Integer.toHexString(System.identityHashCode(javier)));
        System.out.println(Integer.toHexString(System.identityHashCode(alsoJavier)));

        //This modification is stored with the same internal address. This displays the immutability on strings and how they function like a memory saving device.
        String letsTryThis = "Javier";
        System.out.println(Integer.toHexString(System.identityHashCode(letsTryThis)));


        //WHY we use .equals

        //String comparison with == works BUT this doesn't compare the strings, it's comparing the reference(internal address)
        String theOriginalJavier = "Javier";
        System.out.println(letsTryThis == theOriginalJavier);

        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name?");
        String userName = sc.nextLine();
//        System.out.println(theOriginalJavier == userName); //false
//        System.out.println(theOriginalJavier.equals(userName)); //true because it does not compare reference

        System.out.println(javier.equals(userName));
        System.out.println(javier);

    }
}
