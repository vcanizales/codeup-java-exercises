import java.util.Arrays;

public class ArraysLecture {
    //Not really helpful in Java, have a fixed length (fixed quantity) and cannot be modified
    //Rare situations when they are useful

    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[5];
        numbers[0] = 78;
        numbers[1] = 253;
        numbers[2] = -23;
        numbers[3] = -789;
        numbers[4] = 36;
        // sorting the array // call the Arrays object // if you don't give it a default, it'll sort things in its natural ascending order
        Arrays.sort(numbers);
        System.out.println(numbers[0]);

        // Other syntax for building an array
        String[] wordsForWeird = {"strange", "bizarre", "uncanny", "peculiar", "weird" };
        System.out.println(Arrays.toString(numbers));

        // Looping through an array
        for (String wordForWeird : wordsForWeird){
            System.out.println(wordForWeird);
        }

        //Looping through the integers form above
        for(int number : numbers){
            System.out.println(number);
        }

        //Iterating through the array with .length like in Javascript
        for(int i=0; i < numbers.length; i++){
            System.out.printf("The numbers at index %d is %d%n", i, numbers[i]);
        }

    }

}
