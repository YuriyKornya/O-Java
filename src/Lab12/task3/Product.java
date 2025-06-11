package Lab12.task3;

public abstract class Product {
    protected String name;
    protected double price;
    protected int id;

    public Product (String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public abstract String getDescription();

    public void displayInfo() {
        System.out.println("ID: " + id + ", Назва: " + name + ", Ціна: " + price + " грн.");
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
