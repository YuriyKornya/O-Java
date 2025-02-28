package Lab1.task2;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть радіус: ");
        double radius = scanner.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("Площа кола = " + area);
        scanner.close();

    }
}