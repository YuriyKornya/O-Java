package Lab9.task4;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes [0] = new Circle(10);
        shapes [1] = new Rectangle(5,10);
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.area());
        }
    }
}
