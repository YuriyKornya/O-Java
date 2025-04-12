package Lab7.task4;

public class UserAccount {
    private String username;
    private String password;

    void login (String enteredPassword) {
        if (enteredPassword.equals(password)) {
            System.out.println("Успішний вхід!");
        } else {
            System.out.println("Помилка: невірний пароль");
        }
    }

    public String getUsername() {
        return username;
    }


    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    void changePassword(String oldPassword, String newPassword) {
        if (oldPassword.equals(password)) {
            System.out.println("Пароль успішно змінено!");
            password = newPassword;
        } else {
            System.out.println("Помилка: Невірний старий пароль");
        }
    }
}
