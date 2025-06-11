package Lab5.task6;

import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        List<String> options = new ArrayList<>();
        options.add("Камінь");
        options.add("Ножиці");
        options.add("Папір");


        while (true) {
            String playerChoice;

            while (true) {
                System.out.print("Введіть свій вибір (Камінь, Ножиці, Папір): ");
                playerChoice = scanner.nextLine().trim().toLowerCase();

                if (playerChoice.equals("камінь") || playerChoice.equals("ножиці") || playerChoice.equals("папір")) {
                    break;
                } else {
                    System.out.println("Некоректна відповідь! Будь ласка введіть (камінь, ножиці, папір)");
                }
            }

            int computerChoiceIndex = random.nextInt(3);
            String computerChoice = options.get(computerChoiceIndex).toLowerCase();

            if (playerChoice.equals(computerChoice)) {
                System.out.println("Нічия!");
            } else if (
                    (playerChoice.equals("камінь") && computerChoice.equals("ножиці")) ||
                            (playerChoice.equals("ножиці") && computerChoice.equals("папір")) ||
                            (playerChoice.equals("папір") && computerChoice.equals("камінь"))
            ) {
                System.out.println("Ви виграли!");
            } else {
                System.out.println("Виграв комп'ютер!");
            }

            System.out.print("Бажаєте зіграти ще раз? (так/ні): ");
            String playAgain = scanner.nextLine().trim().toLowerCase();
            if (!playAgain.equals("так")) {
                break;
            }
        }
        System.out.println("Дякую за гру!");
        scanner.close();
    }
}
