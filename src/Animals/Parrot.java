package Animals;

public class Parrot extends Bird{
    public void makeNoise(){
        super.makeNoise();
        System.out.println("What's up");
    }

    public void echo(String input){
        System.out.println(input);
    }
}
