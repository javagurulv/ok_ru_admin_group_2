package student_sergo_kurbanov.lesson_8.level_3;

public class SuperClassConstructorInvoker {
    public SuperClassConstructorInvoker() {
        super(); // must be the first
        System.out.println(1);
        System.out.println(2);
    }
}