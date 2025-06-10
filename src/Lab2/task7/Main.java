package Lab2.task7;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть мінімальне значення: ");
        int min = scanner.nextInt();
        System.out.print("Введіть максимальне значення: ");
        int max = scanner.nextInt();
        int randomNum = random.nextInt(0, 100);
        boolean pair = (randomNum % 2 == 0);

        System.out.printf("Згенероване число: %d\n", randomNum);
        System.out.printf("Число %d %s парним \n", randomNum, pair ? "є" : "не є");


        scanner.close();
    }
}
