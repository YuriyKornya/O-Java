package Lab4.task4;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ваше ім'я: ");
        String name = scanner.nextLine();
        System.out.print("Введіть ваш вік: ");
        int age = scanner.nextInt();

        printInfo();
        String result1 = printInfo(name);
        String result2 = printInfo(name, age);

        System.out.println(result1);
        System.out.println(result2);

        scanner.close();
    }

    public static void printInfo() {
        System.out.println();
    }

    public static String printInfo(String name) {
        return "Вітаю, світ! Моє ім'я: " + name;
    }
    public static String printInfo(String name, int age) {
        return "Вітаю, світ! Моє ім'я: " + name + ", " + age + " років";
    }

}
