package Lab11.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<String> tasks = new ArrayList<>();
    private static final List<Boolean> taskStatus = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            TaskManagerApp.showMenu();
            int choice = TaskManagerApp.getUserChoice();
            TaskManagerApp.handleUserChoice(choice);
        }
    }
}
