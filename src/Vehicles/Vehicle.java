package Vehicles;

public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("Vroom vroom");
    }

    public void alarm(){
        System.out.println("whooo whooo whoooo");
    }
}
