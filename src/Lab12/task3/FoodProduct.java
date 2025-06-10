package Lab12.task3;

public class FoodProduct extends Product{
    private String expirationDate;

    public FoodProduct (String name, int price, int id, String expirationDate) {
        super(name, price, id);
        this.expirationDate = expirationDate;
    }

    public String getDescription () {
     return ("Продукт: " + name + " Ціна: " + price + " грн" + "Придатний до: " + expirationDate);
    }

    public void applyDiscount (double percent) {
        price = price - (price * percent / 100);
    }
}
