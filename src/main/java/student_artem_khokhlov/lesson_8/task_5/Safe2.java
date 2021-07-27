package student_artem_khokhlov.lesson_8.task_5;

import java.util.Scanner;

public class Safe2 {
    private Integer deposit;
    private String password;

    public Safe2(Integer deposit, String password) {
        this.deposit = deposit;
        this.password = password;
    }
    public Safe2() {
        this.deposit = 0;
        this.password = "";
    }

    public Integer getDeposit() {
        Scanner sc = new Scanner(System.in);
        String password;
        System.out.println("Enter password: ");
        password = sc.nextLine();
        if (password.equals(this.password)) {
            return deposit;
        }
        else {
            System.out.println("Wrong password");
            return -1;
        }
    }

    public void setDeposit(Integer deposit) {
        Scanner sc = new Scanner(System.in);
        String password;
        System.out.println("Enter password: ");
        password = sc.nextLine();
        if (password.equals(this.password)) {
            Integer old_deposit = this.deposit;
            this.deposit = deposit;
            System.out.println("Changed deposit: " + old_deposit.toString() + " --> " + this.deposit.toString());
        }
        else {
            System.out.println("Wrong password");
        }
    }

    public void setPassword (String newPassword) {
        if (this.password.equals("")) {
            this.password = newPassword;
        }
        else {
            System.out.println("Can't change defined password.");
        }
    }

    @Override
    public String toString() {
        return "Safe2{" +
                "deposit=" + deposit +
                '}';
    }
}
