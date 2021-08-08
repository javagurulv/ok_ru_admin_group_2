package student_sergo_kurbanov.lesson_8.level_1;

public class SafeDemo2 {
    public static void main(String[] args) {
        String password = "qwerty";
        Safe2 safe2 = new Safe2(5, password);

        safe2.putMoney(100, password);
        System.out.println(safe2.getMoney(password));
    }
}
