package Lab3.task8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        System.out.println("Масив: " + Arrays.toString(array));
        System.out.print("Введіть число для пошуку: ");
        int target = scanner.nextInt();
        boolean found = false;
        for (int num : array) {
            if (num == target) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Число знайдено!" : "Число не знайдено.");
        scanner.close();
    }
}

