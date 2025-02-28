package Lab1.task3;
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Значення byte: ");
        byte number = scanner.nextByte();
        double result = number * 5;
        System.out.println("Значення double * 5 = " + result);
        int number1 = (int) result;
        System.out.println("Значення int: " + number1);
        scanner.close();
    }
}
