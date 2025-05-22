package Lab5.task1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 3. Запитайте у користувача та збережіть значення у змінні
        System.out.print("Введіть початкову суму вкладу: ");
        double principal = scanner.nextDouble();
        System.out.print("Введіть місячний платіж: ");
        double monthlyDeposit = scanner.nextDouble();
        System.out.print("Введіть річну процентну ставку: ");
        double annualRate = scanner.nextDouble();
        System.out.print("Введіть кількість років вкладу: ");
        double years = scanner.nextDouble();
        System.out.print("Введіть кількість нарахувань відсотків на рік: ");
        double timesCompounded = scanner.nextDouble();

        // 4. Переведіть процентну ставку у десятковий вигляд
        double newAnnualRate = annualRate / 100;

        // 5. Обчисліть кінцеву суму за формулою складеного відсотка
        double finalAmount = principal * Math.pow(1 + newAnnualRate / timesCompounded, timesCompounded * years);

        // 6. Виведіть результат у зручному форматі
        System.out.printf("Сума через %.0f років становить: %.2f грн%n ", years, finalAmount);

        // 7. Закрийте Scanner
        scanner.close();
    }
}
