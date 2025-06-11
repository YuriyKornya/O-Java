package Lab12.task3;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Product> productsInCart = new ArrayList<>();

    public void add(Product product) {
        productsInCart.add(product);
        System.out.println("Товар додано до кошика: " + product.getName());
    }

    public void showCart() {
        if (productsInCart.isEmpty()) {
            System.out.println("Кошик порожній.");
        } else {
            for (Product product : productsInCart) {
                System.out.println(product.getDescription());
            }
        }
    }

    public double getTotal() {
        double total = 0;
        for (Product product : productsInCart) {
            total += product.getPrice();
        }
        return total;
    }
}

