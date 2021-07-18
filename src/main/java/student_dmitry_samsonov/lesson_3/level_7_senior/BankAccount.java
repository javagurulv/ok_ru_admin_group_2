package student_dmitry_samsonov.lesson_3.level_7_senior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BankAccount {

    String owner;
    Integer money;

    BankAccount(String owner, Integer moneyAmount) {
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