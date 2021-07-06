package student_dmitry_samsonov.lesson_8.level_3_junior;

public class SuperClassConstructorInvoker {
    public SuperClassConstructorInvoker() {
        System.out.println(1);
        //super();
        // Потому что класс не является наследником
        System.out.println(2);
    }
}