public class ConsoleIOLecture {
    public static void main(String[] args) {
        String cohort = "Weywot";
        String timeOfDay = "morning";
        byte week = 10;
        float someNumber = 123.456F;
        System.out.printf("Good, %s %s! %n", timeOfDay, cohort);
        System.out.printf("This is the %dth week of %s cohort.", week, cohort);
        System.out.println("Will this be on a separate line?");
        System.out.println("Valeria");
        System.out.printf("The number is %-11.2f%n", someNumber);
    }
}
