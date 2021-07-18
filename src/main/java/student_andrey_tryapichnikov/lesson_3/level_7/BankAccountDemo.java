package student_andrey_tryapichnikov.lesson_3.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor", 100000);
        String ownerFirstName = bankAccount.getOwner();
        String moneyAmount = bankAccount.getMoney();
        /*
        System.out.println("Owner = " + owner);
        System.out.println("Money = " + money);
        */
        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);
    }
}
