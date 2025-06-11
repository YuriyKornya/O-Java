package Lab5.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <String> questions = new ArrayList<>();
        List <String> answers = new ArrayList<>();
        List <String> correctAnswers = new ArrayList<>();

        questions.add("1. Яка столиця України?");
        answers.add("а) Львів");
        answers.add("б) Київ");
        answers.add("в) Одеса");
        questions.add("2. Яка найдовша річка в Україні");
        answers.add("a) Дніпро");
        answers.add("б) Дністер");
        answers.add("в) Південний буг");
        questions.add("3. Хто автор поеми Кобзар?");
        answers.add("а) Леся Українка");
        answers.add("б) Тарас Шевченко");
        answers.add("в) Іван Франко");
        questions.add("4. Який традиційний український символ є на гербі України?");
        answers.add("a) Тризуб");
        answers.add("б) Серп і молот");
        answers.add("в) Орел");
        questions.add("5. Яке найпопулярніше українське страва з борщем?");
        answers.add("а) Вареники");
        answers.add("б) Сало");
        answers.add("в) Паляниця");

        correctAnswers.add("б"); // для питання 1
        correctAnswers.add("а"); // для питання 2
        correctAnswers.add("б"); // для питання 3
        correctAnswers.add("а"); // для питання 4
        correctAnswers.add("б"); // для питання 5

        int score = 0;

        for (int i = 0; i < questions.size(); i++) {
            System.out.println(questions.get(i));
            System.out.println(answers.get(i * 3));
            System.out.println(answers.get(i * 3 + 1));
            System.out.println(answers.get(i * 3 + 2));

            String userAnswer;
            while (true) {
                System.out.print("Ваша відповідь (а/б/в): ");
                userAnswer = scanner.nextLine().trim().toLowerCase();

                if (userAnswer.equals("а") || userAnswer.equals("б") || userAnswer.equals("в")) {
                    break;
                } else {
                    System.out.println("Некоректна відповідь. Будь ласка, введіть 'а', 'б' або 'в'.");
                }
            }

                if (userAnswer.equalsIgnoreCase(correctAnswers.get(i))) {
                    score = score + 1;
                    System.out.println("Правильна відповідь!");
                } else {
                    System.out.println("Неправильна відповідь!");
                }
            }

        System.out.println();
        System.out.println("Вікторина завершена!");
        System.out.println("Твій рахунок: " + score + " правильних відповідей із " + questions.size() + " запитань.");

        scanner.close();
    }
}