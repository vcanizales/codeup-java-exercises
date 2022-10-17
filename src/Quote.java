import java.lang.Math;
import java.util.Random;

public class Quote {

    public static String RandomQuote() {
        int randomNumber = (int) (Math.random()* 4) + 1;
        switch (randomNumber){
            case 1: return "Time is money";
            case 2: return "Pura Vida";
            case 3: return  "Knowledge is power";
            case 4: return "With great power comes great responsibility";
            default: return "Blah";
        }
    }
}