package student_alexander_zhukov.lesson_3.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BankAccount {
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
        return this.money + "";
    }
}
