package Lab12.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> products = new ArrayList<>();
        products.add("Ноутбук");
        products.add("Комп'ютер");
        products.add("Навушники");
        products.add("Клавіатура");
        products.add("Миша");

        List<String> basket = new ArrayList<>();

        while (true) {
            System.out.println("1 - Переглянути список товарів.");
            System.out.println("2 - Додати товар в кошик.");
            System.out.println("3 - Переглянути кошик.");
            System.out.println("4 - Вихід.");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < products.size(); i++) {
                        System.out.println((i + 1) + ". " + products.get(i));
                    }
                    break;
                case 2:
                    System.out.println("Введіть номер товару: ");
                    int productNumber = scanner.nextInt();
                    if (productNumber >= 1 && productNumber <= products.size()) {
                        String selectedProduct = products.get(productNumber - 1);
                        basket.add(selectedProduct);
                        System.out.println("Товар додано до кошику");
                    } else {
                        System.out.println("Невірний номер товару!");
                    }
                    break;
                case 3:
                    if (basket.isEmpty()) {
                        System.out.println("Кошик порожній");
                    } else {
                        for (String product : basket) {
                            System.out.println(product);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Вихід...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Недійсний варіант. Спробуйте знову.");
            }
        }
    }
}
