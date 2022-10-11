public class syntaxLexture {
    public static void main(String[] args) {
       //Declare a variable without initializing
        int weight;
        String breed;
        //Initialize after declaration
        weight = 12;
        breed = "Cavalier King Charles Spaniel";
        //Initialize and declare all at once
        String name = "Grinch";
        int cutenessFactor = 10;
        //Statement: "JVM do something"
//        System.out.println(name + " is a " + breed + ".");
        //Conditional Logic
//        if (cutenessFactor > 8){
//            System.out.println(name + " is cute.");
//        } else {
//            System.out.println(name + " needs to work on cuteness.");
//        }

        boolean isGrinchCute = true;
        char oneLetter = 'a';
        byte smallNumber; //-128 to 127
        short mediumNumber;
        int number;
        long bigNumber;

        smallNumber = 12;
        System.out.println(smallNumber);
        number = smallNumber;
        System.out.println(number);

        bigNumber = 9000000000000L;

        float imafloat = 2.34F;
        double imadouble = 9.81234556789786712;
        System.out.println(imadouble);
        imafloat = (float) imadouble;
        System.out.println(imafloat);
    }
}
