package Lab3.task9;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        System.out.println("Початковий масив: " + Arrays.toString(array));

        System.out.print("Введіть індекс елемента для зміни (0-9): ");
        int index = scanner.nextInt();

        if (index >= 0 && index < array.length) {
            System.out.print("Введіть нове значення: ");
            int newValue = scanner.nextInt();

            array[index] = newValue;

            System.out.println("Оновлений масив: " + Arrays.toString(array));
        } else {
            System.out.println("Помилка: некоректний індекс.");
        }

        scanner.close();
    }
}

