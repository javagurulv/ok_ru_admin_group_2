package student_alexander_fateev.lesson8.level_1.task5;

class Safe2Demo {
    public static void main(String[] args) {
        String password = "abc";
        int moneyAmount = 1000;
        System.out.println("Current money amount: " + moneyAmount);

        Safe2 mySafe = new Safe2(password, moneyAmount);

        int result = mySafe.putMoney(password, 20);
        if (result != -1) {
            System.out.println("New money amount: " + result);
        }

        result = mySafe.getMoney(password);
        if (result != -1) {
            System.out.println("Current money amount: " + result);
        }
    }
}
