package student_artem_khokhlov.lesson_8.task_5;

public class Safe2Demo {
    public static void main(String[] args) {
        Safe2 testSafe = new Safe2(10, "123qwe");
        Safe2 testSafe2 = new Safe2();
        testSafe2.setPassword("ewq123");

        testSafe.getDeposit();
        System.out.println("Got deposit: " + testSafe.getDeposit().toString());
        testSafe2.setDeposit(100);

        System.out.println(testSafe);
        System.out.println(testSafe2);
    }
}
