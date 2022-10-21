package Animals;

public class Bird {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
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
}

