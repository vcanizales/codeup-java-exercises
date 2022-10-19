import java.util.Random;

public class ServerNameGenerator {

   public static String[] adjectives = {"lovely", "ugly", "smelly", "cocky", "hungry", "brave", "bright", "shy", "perfect", "naughty"};

    public static String[] nouns = {"guitar", "television", "dog", "pool", "toy", "cat", "pizza", "wings", "antacid", "pillow"};

    public static String randomPick(String[] wordsArray) {
        Random random = new Random();
        int index = random.nextInt(wordsArray.length);

        return wordsArray[index];
    }

    public static void main(String[] args) {
        System.out.printf("Here is your server name: %n %s-%s", randomPick(adjectives), randomPick(nouns));
    }
}
