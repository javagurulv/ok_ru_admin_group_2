package student_andrey_tryapichnikov.lesson_3.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class BankAccount {

    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    public BankAccount(String ownerFirstName,
                       String ownerLastName,
                       int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }

    public String getOwnerFirstName() {
        return this.ownerFirstName;
    }

    public String getOwnerLastName() {
        return this.ownerFirstName;
    }

    public int getMoneyAmount() {
        return this.moneyAmount;
    }

}
