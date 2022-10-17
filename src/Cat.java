public class Cat {
    public static String sound(){
        return "meow meow";
    }

    public static String name(){
        return "Oliver";
    }

public static void makeNoise(){
    System.out.println(name() + " goes " + Quote.RandomQuote());
}
    public static void main(String[] args) {
        makeNoise();
    }
}

//public class Cat{
//    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.name = "Oliver";
//        cat.sound = "meow meow";
//        cat.makeNoise();
//    }
//}
