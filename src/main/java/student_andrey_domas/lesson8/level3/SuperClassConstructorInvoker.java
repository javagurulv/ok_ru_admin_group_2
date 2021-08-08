package student_andrey_domas.lesson8.level3;

public class SuperClassConstructorInvoker {
    public SuperClassConstructorInvoker() {
        // super-constructor call must be the first statement.
        super();
        System.out.println(1);
        System.out.println(2);
    }
}
