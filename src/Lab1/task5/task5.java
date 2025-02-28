package Lab1.task5;
import java.util.Scanner;
public class task5 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Name: " + name);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Age: " + age + " років");

        System.out.print("Enter your height (m): ");
        double height = scanner.nextDouble();
        System.out.println("Height: " + height + " m");

        System.out.print("Are you a student: ");
        boolean isTrue = scanner.nextLine() == "yes" ? true : false;
        System.out.println("Student: " + isTrue);

        scanner.close();
    }
}
