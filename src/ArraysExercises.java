import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] names, Person newPerson){
        Person[] employees = Arrays.copyOf(names, names.length + 1);
        employees[names.length] = newPerson;
        return employees;
    }


    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person person = new Person();

        Person[] names = new Person[3];
        names[0] = new Person("Anne");
        names[1] = new Person("Fran");
        names[2] = new Person("Shan");
//        for(Person name : names){
//            System.out.println(name.getName());
//        }

        Person Lisa = new Person("Lisa");
        names = addPerson(names, Lisa);
        for(Person name : names){
            System.out.println(name.getName());
        }

    }
}
