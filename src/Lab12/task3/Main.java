package Lab12.task3;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Store store = new Store();
        Cart cart = new Cart();

        while (true) {
            System.out.println("Меню:");
            System.out.println("1 - Показати каталог товарів");
            System.out.println("2 - Додати товар у кошик");
            System.out.println("3 - Показати вміст кошика");
            System.out.println("4 - Оформити замовлення");
            System.out.println("0 - Вийти");
            System.out.print("Ваш вибір: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Каталог товарів:");
                    store.showAllProducts();
                    break;

                case "2":
                    System.out.print("Введіть ID товару для додавання в кошик: ");
                    int id = Integer.parseInt(scanner.nextLine());

                    Product product = null;
                    List<Product> products = store.getProducts();

                    for (Product p : products) {
                        if (p.getId() == id) {
                            product = p;
                            break;
                        }
                    }

                    if (product != null) {
                        cart.add(product);
                        System.out.println("Товар додано до кошика.");
                    } else {
                        System.out.println("Товар з таким ID не знайдено.");
                    }
                    break;

                case "3":
                    System.out.println("Вміст кошика:");
                    cart.showCart();
                    System.out.println("Загальна сума: " + cart.getTotal() + " грн.");
                    break;

                case "4":
                    double total = cart.getTotal();
                    if (total == 0) {
                        System.out.println("Кошик порожній. Додайте товари для оформлення замовлення.");
                    } else {
                        for (Product p : store.getProducts()) {
                            if (p instanceof Discountable) {
                                ((Discountable) p).applyDiscount(10);
                            }
                        }

                        total = cart.getTotal();
                        System.out.println("Ваша сума до оплати: " + total + " грн.");
                        System.out.println("Дякуємо за покупку!");
                        cart = new Cart();
                    }
                    break;


                case "0":
                    System.out.println("Вихід...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Невірний варіант, спробуйте ще раз.");
            }
        }
    }
}


