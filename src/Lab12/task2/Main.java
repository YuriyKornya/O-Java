package Lab12.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
        private static final Scanner scanner = new Scanner(System.in);
        private static final List<String> tasks = new ArrayList<>();
        private static final List<Boolean> taskStatus = new ArrayList<>();

    public static void main(String[] args) {
        OnlineShopApp.initProducts();
        while (true) {
            OnlineShopApp.showMenu();
            int choice = OnlineShopApp.getUserChoice();
            OnlineShopApp.handleUserChoice(choice);
        }
    }
}
