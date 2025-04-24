package Lab9.task1;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sumInt = calculator.add(5, 7);
        System.out.println("Сума двох цілих чисел: " + sumInt);

        double sumDouble = calculator.add(3.5, 2.8);
        System.out.println("Сума двох чисел з плаваючою комою: " + sumDouble);

        int sumThreeInt = calculator.add(1, 2, 3);
        System.out.println("Сума трьох цілих чисел: " + sumThreeInt);

    }
}
