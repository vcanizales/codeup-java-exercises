package Animals;

public class Bird {
    private String name;
//    protected String name;

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("Ca-caw");
    }


    //Polymorphism Argument
    public void birdSounds(Bird[] birdsArray){
        for(Bird bird : birdsArray){
            bird.makeNoise();
        }
    }

    public Bird(){
        System.out.println("A bird just got constructed");
    }
}

