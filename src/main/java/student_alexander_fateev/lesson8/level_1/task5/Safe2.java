package student_alexander_fateev.lesson8.level_1.task5;

class Safe2 {
    private String password;
    private int moneyAmount;

    public Safe2(String password, int moneyAmount) {
        this.password = password;
        this.moneyAmount = moneyAmount;
    }

    int putMoney (String password, int addMoney) {
        if (password.equals(this.password)) {
            if (addMoney > 0) {
                moneyAmount += addMoney;
                return moneyAmount;
            }
            else {
                System.out.println("ERROR: incorrect value");
                return -1;
            }
        }
        else {
            System.out.println("ERROR: incorrect password");
            return -1;
        }
    }

    int getMoney(String password) {
        if (password.equals(this.password)) {
            return moneyAmount;
        }
        else {
            return -1;
        }
    }
}
