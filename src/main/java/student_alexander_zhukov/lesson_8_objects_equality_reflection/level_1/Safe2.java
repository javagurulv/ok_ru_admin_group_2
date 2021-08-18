package student_alexander_zhukov.lesson_8_objects_equality_reflection.level_1;

class Safe2 {

    private String password;
    private int balance;

    Safe2(String password, int balance) {
        this.balance = balance;
        this.password = password;
    }

    String putMoney(String password, int sum){
        if (this.password.equals(password)) {
            this.balance += sum;
            return "Balance: " + this.balance;
        }
        return "Wrong password";
    }

    String getMoney(String password, int sum){
        if (this.password.equals(password) && sum <= this.balance) {
            this.balance -= sum;
            return "Balance: " + this.balance;
        }
        return "Wrong password or low balance";
    }
}
