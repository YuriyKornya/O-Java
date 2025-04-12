package Lab7.task2;

public class Book {
    private String title;
    private String author;
    private int price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Помилка: ціна не можу бути менше нуля");
        }
    }

   void displayInfo () {
       System.out.println("Назва: " + this.title);
       System.out.println("Автор: " + this.author);
       System.out.println("Ціна: " + this.price);
   }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        setPrice(price);
    }
}
