package Lab6.task5;

public class Main {
    public static void main (String [] args) {
        Book book = new Book("Чистий код", "Роберт Сесіл Мартін");
        Book book1 = new Book("Програмування мовою Java");
        System.out.println("Книга: " + book.title + ", автор: " + book.author);
        System.out.println("Книга: " + book1.title + ", автор: " + book1.author);
    }
}
