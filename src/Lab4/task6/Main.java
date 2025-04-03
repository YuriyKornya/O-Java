package Lab4.task6;

public class Main {
    public static void main (String [] args) {
        printNumber();
        // System.out.println(num);
        // Чому виникає помилка?
        // Виникає тому що область цієї змінної локальна тільки для методу printNumber
    }
    public static void printNumber () {
        int num = 10;
        System.out.println("Num: " + num);
    }
}
