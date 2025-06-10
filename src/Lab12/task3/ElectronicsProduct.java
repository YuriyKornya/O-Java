package Lab12.task3;

public class ElectronicsProduct extends Product{
    private String brand;

    public ElectronicsProduct(String name, int price, int id, String brand) {
        super(name, price, id);
        this.brand = brand;
    }

    @Override
    public String getDescription () {
        return ("Електроніка: " + name + " Ціна: " + price + " Бренд: " + brand);
    }
}
