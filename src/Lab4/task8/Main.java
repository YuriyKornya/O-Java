package Lab4.task8;

public class Main {
    static int counter = 5;
    public static  void main (String [] args) {
        setCounter(10);
        System.out.println("Після виклику метода: " + counter);
    }
    public static void setCounter (int newCounter) {
        counter = newCounter;
        System.out.println("Всередині методу: " + counter);
    }
}
