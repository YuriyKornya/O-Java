package Lab11.task1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tasks = new ArrayList<>();
        List<Boolean> taskStatus = new ArrayList<>();
        while (true) {
            System.out.println("1 - Показати всі задачі");
            System.out.println("2 - Додати нову задачу");
            System.out.println("3 - Позначити задачу як виконану");
            System.out.println("4 - Видалити задачу");
            System.out.println("5 - Вийти");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (tasks.isEmpty()) {
                        System.out.println("Немає доступних задач.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            String status = taskStatus.get(i) ? "[Готово] " : "[В очікуванні] ";
                            System.out.println((i + 1) + ". " + status + tasks.get(i));
                        }
                    }
                        break;
                case 2:
                    System.out.println("Введіть нову задачу: ");
                    scanner.nextLine();
                    String task = scanner.nextLine();
                    tasks.add(task);
                    taskStatus.add(false);
                    System.out.println("Задачу додано: ");
                    break;
                case 3:
                    System.out.print("Введіть номер задачі, щоб позначити його як виконане:");
                    int doneIndex = scanner.nextInt() - 1;
                    if (doneIndex >= 0 && doneIndex < tasks.size()) {
                        taskStatus.set(doneIndex, true);
                        System.out.println("Задача позначена як виконане!");
                    } else {
                        System.out.println("Недійсний номер задач.");
                    }
                    break;
                case 4:
                    System.out.print("Введіть номер задачі, щоб видалити: ");
                    int deleteIndex = scanner.nextInt() - 1;
                    if (deleteIndex >= 0 && deleteIndex < tasks.size()) {
                        tasks.remove(deleteIndex);
                        taskStatus.remove(deleteIndex);
                        System.out.println("Задача видалена!");
                    } else {
                        System.out.println("Недійсний номер задач.");
                    }
                    break;
                case 5:
                    System.out.println("Вихід...");
                    scanner.close();
                    return;

                    default:
                        System.out.println("Недійсний варіант. Спробуйте знову.");
            }
        }
    }
}

