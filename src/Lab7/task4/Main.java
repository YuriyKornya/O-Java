package Lab7.task4;

public class Main {
    public static void main(String[] args) {
        UserAccount userAccount = new UserAccount("Yuriy", "12345");

        System.out.println("Логін: " + userAccount.getUsername());

        userAccount.login("12345");
        userAccount.changePassword("12345", "356123");

    }
}
