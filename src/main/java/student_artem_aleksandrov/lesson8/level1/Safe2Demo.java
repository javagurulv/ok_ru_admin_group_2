package student_artem_aleksandrov.lesson8.level1;

public class Safe2Demo {
    public static void main(String[] args) throws InvalidPassword {
        String password = "Strong password";
        Safe2 safe2 = new Safe2(password);

        safe2.putMoney(100, password);
        safe2.getMoney(10, password);
        System.out.println("Balance: %s".formatted(safe2.getAccount()));

    }
}
