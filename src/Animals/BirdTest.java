package Animals;

public class BirdTest {
    public static void main(String[] args) {
        Bird crow = new Bird();
        crow.setName("Dr. Crow");
        System.out.print(crow.getName() + " goes " );
        crow.makeNoise();
        TweetyBird goldfinch = new TweetyBird();
        goldfinch.makeNoise();
        Parrot parrot = new Parrot();
        parrot.echo("yeehaw");
        parrot.makeNoise();
        Bird parrot2 = new Parrot();
        parrot2.makeNoise();
        parrot2.setName("Perico");
        System.out.println(parrot2.getName());


    }
}
