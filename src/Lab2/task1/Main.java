package Lab2.task1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Число є додатним.");
        }
        else if (number < 0) {
            System.out.println("Число є від'ємним.");
        }
        else {
            System.out.println("Число дорівнює 0.");
        }

        scanner.close();
    }
}
