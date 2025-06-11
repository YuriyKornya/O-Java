package Lab12.task3;

public class BookProduct extends Product {
    private String author;

    public BookProduct(String name, int price, int id, String author) {
        super(name, price, id);
        this.author = author;
    }

    @Override
    public String getDescription() {
        return ("Книга (" + id + "): " + " Назва: " + name + " Автор: " + author + " Ціна: " + price);
    }
}