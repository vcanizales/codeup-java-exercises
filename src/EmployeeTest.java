public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.name = "Pablo";
        employee2.name = "Escobar";
        employee3.name = "Checo";

        System.out.println(employee1.displayEmployeeInfo());
        System.out.println(employee2.displayEmployeeInfo());
        System.out.println(employee3.displayEmployeeInfo());

        Employee.company = "Some other company";
        System.out.println(Employee.company);
    }
}
