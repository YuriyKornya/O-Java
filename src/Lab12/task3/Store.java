package Lab12.task3;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private static final List<Product> products = new ArrayList<>();
    BookProduct book = new BookProduct("Чистий код",1000, 1, "Роберт Мартін");
    ElectronicsProduct electronic = new ElectronicsProduct("Phone",50000,2,"Iphone");
    FoodProduct food = new FoodProduct("Pizza", 500,3,"05.06.25");

    products.add(book);
    products.add(electronic);
    products.add(food)

    public void addProduct(Product product) {
        products.add(product);
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

    public void findProductById () {

    }

    public List<Product> getProduct() {
        return products;
    }
}