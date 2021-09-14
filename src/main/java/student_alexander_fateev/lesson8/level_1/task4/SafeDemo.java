package student_alexander_fateev.lesson8.level_1.task4;

class SafeDemo {
    public static void main(String[] args) {
        Safe mySafe = new Safe();

        // Get money amount
        System.out.println(mySafe.moneyAmount);

        // Get password
        System.out.println(mySafe.password);

        // Change money amount
        mySafe.moneyAmount = 30;
        System.out.println(mySafe.moneyAmount);

        // Change password
        mySafe.password = "newpassword";
        System.out.println(mySafe.password);
    }
}
