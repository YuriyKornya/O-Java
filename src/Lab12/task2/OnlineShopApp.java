package Lab12.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineShopApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<String> products = new ArrayList<>();
    private static final List<String> basket = new ArrayList<>();

    public static void initProducts() {
        products.add("Ноутбук");
        products.add("Комп'ютер");
        products.add("Навушники");
        products.add("Клавіатура");
        products.add("Миша");
    }

    public static void showMenu() {
        System.out.println("1 - Переглянути список товарів.");
        System.out.println("2 - Додати товар в кошик.");
        System.out.println("3 - Переглянути кошик.");
        System.out.println("4 - Вихід.");
    }

    public static int getUserChoice() {
        while (!scanner.hasNextInt()) {
            System.out.println("Невірний вхід. Будь ласка, введіть номер.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static void handleUserChoice(int choice) {
        scanner.nextLine();
        switch (choice) {
            case 1 -> showProduct();
            case 2 -> addToBasket();
            case 3 -> showBasket();
            case 4 -> exitApp();
            default -> System.out.println("Недійсний варіант. Спробуйте знову.");
        }
    }

    public static void showProduct() {
                for (int i = 0; i < products.size(); i++) {
                    System.out.println((i + 1) + ". " + products.get(i));
                }
        }

    public static void addToBasket () {
        System.out.println("Введіть номер товару: ");
        int productNumber = scanner.nextInt();
        if (productNumber >= 1 && productNumber <= products.size()) {
            String selectedProduct = products.get(productNumber - 1);
            basket.add(selectedProduct);
            System.out.println("Товар додано до кошику");
        } else {
            System.out.println("Невірний номер товару!");
        }
    }

    public static void showBasket () {
        if (basket.isEmpty()) {
            System.out.println("Кошик порожній");
        } else {
            for (String product : basket) {
                System.out.println(product);
            }
        }
    }

    public static void exitApp() {
        System.out.println("Вихід...");
        scanner.close();
        System.exit(0);
    }
}


