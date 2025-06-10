package Lab2.task5;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть рядок: ");
        String row = scanner.nextLine();

        int length = row.length();
        char letter = row.charAt(0);
        char letter1 = row.charAt(15);

        System.out.println(length);
        System.out.println(letter);
        System.out.println(letter1);
        System.out.println(row.toUpperCase());
        System.out.println(row.toLowerCase());

        String substring;
        if (row.length() >= 3) {
            substring = row.substring(0, 3);
        } else {
            substring = row;
        }
        System.out.println(substring);
        boolean isTrue = row.contains("Java");
        System.out.println("Чи містить слово 'Java'? " + isTrue);

        scanner.close();
    }
}