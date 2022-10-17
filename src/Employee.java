public class Employee {

    //name instance variable
    public String name;
    //static company variable
    public static String company = "Veridian Dynamics";
    //non static method to display employee info
    public String displayEmployeeInfo(){
        return name + " works at " + company;
    }

    public Employee(){

    }
}
