package Lab1.task6;
import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Довжина прямокутника: ");
        double length = scanner.nextDouble();
        System.out.print("Ширина прямокутника: ");
        double width = scanner.nextDouble();
        double area = length * width;
        System.out.println("Площа прямокутника: " + area);

        scanner.close();
    }
}
