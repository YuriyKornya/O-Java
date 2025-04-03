package Lab4.task5;

public class Main {
    public static void main(String[] args) {
        double radius = 25;
        double width = 20;
        double length = 15;

        calculateArea();
        String result1 = calculateArea(radius);
        String result2 = calculateArea(width, length);

        System.out.println(result1);
        System.out.println(result2);

    }

    public static void calculateArea() {
        System.out.println();
    }

    public static String  calculateArea(double radius) {
        return "Площа круга: " + (3.16 * radius * radius);
    }
    public static String calculateArea(double width, double length) {
        return "Площа прямокутника: " + (width * length);
    }
}
