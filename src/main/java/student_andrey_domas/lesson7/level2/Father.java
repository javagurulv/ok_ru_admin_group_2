package student_andrey_domas.lesson7.level2;

public interface Father {
    default void conception() {
        System.out.println("Father conception");
    }
}
