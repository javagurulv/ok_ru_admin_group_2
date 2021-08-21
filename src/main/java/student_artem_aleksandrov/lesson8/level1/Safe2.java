package student_artem_aleksandrov.lesson8.level1;

class InvalidPassword extends Exception {

    public InvalidPassword(String message) {
        super(message);
    }
}

public class Safe2 {

    private String password;

    private int account;

    public Safe2(String password) {
        this.password = password;
    }

    public int getAccount() {
        return account;
    }

    public boolean checkPassword(String password) {
        return this.password == password;
    }

    public void putMoney(int money, String password) throws InvalidPassword {
        if (checkPassword(password)) {
            this.account += money;
        } else {
            InvalidPassword exception = new InvalidPassword("Invalid password");
            throw exception;
        }
    }

    public void getMoney(int money, String password) throws InvalidPassword {
        if (checkPassword(password)) {
            this.account -= money;
        } else {
            InvalidPassword exception = new InvalidPassword("Invalid password");
            throw exception;        }
    }

}
