package student_sergo_kurbanov.lesson_3.level_7;

public class BankAccount {
    String owner;
    int money;

    BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        this.money = moneyAmount;
    }

    String getOwner() {
        return this.owner;
    }

    String getMoney() {
        return Integer.toString(this.money);
    }
}
