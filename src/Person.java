public class Person {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello" + this.name + "!");
    }

    public Person(){}

    public Person(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}
