package Lab8.task4;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Площа круга: " + circle.area());
        System.out.println("Площа прямокутника: " + rectangle.area());
    }
}
