package Lab3.task6;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        System.out.print("Масив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        int min = array[0], max = array[0], sum = 0, countEven = 0;
        for (int num : array) {
            if (num < min) min = num;
            if (num > max) max = num;
            sum += num;
            if (num % 2 == 0) countEven++;
        }
        double average = (double) sum / size;
        System.out.println("Мінімальний елемент: " + min);
        System.out.println("Максимальний елемент: " + max);
        System.out.println("Середнє значення: " + average);
        System.out.println("Кількість парних чисел: " + countEven);
        scanner.close();
    }
}
