package Lab12.task3;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private static final List<Product> products = new ArrayList<>();

    public Store() {
        BookProduct book1 = new BookProduct("Чистий код", 1000, 1, "Роберт Мартін");
        BookProduct book2 = new BookProduct("Алгоритми: побудова та аналіз", 920,2,"Томас Кормен");
        BookProduct book3 = new BookProduct("Мистецтво програмування", 1200, 3, "Дональд Кнут");
        ElectronicsProduct phone = new ElectronicsProduct("Phone", 50000, 4, "Iphone");
        ElectronicsProduct laptop = new ElectronicsProduct("Ноутбук Dell", 30000, 5,"Dell");
        ElectronicsProduct headphones =  new ElectronicsProduct("Airpods pro", 11000,6, "Apple");
        FoodProduct pizza = new FoodProduct("Pizza", 500, 7, "20.06.25");
        FoodProduct croissant = new FoodProduct("Croissant", 50, 8,"13.06.25");
        FoodProduct burger = new FoodProduct("Burger", 150,9,"13.06.25");


        products.add(book1);
        products.add(book2);
        products.add(book3);
        products.add(phone);
        products.add(laptop);
        products.add(headphones);
        products.add(pizza);
        products.add(croissant);
        products.add(burger);

    }

    public void showAllProducts() {
        if (products.isEmpty()) {
            System.out.println("Каталог товарів порожній.");
        } else {
            for (Product product : products) {
                product.displayInfo();
            }
        }
    }

    public List<Product> getProducts() {
        return products;
    }
}

