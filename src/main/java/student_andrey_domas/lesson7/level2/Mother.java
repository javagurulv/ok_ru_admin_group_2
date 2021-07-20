package student_andrey_domas.lesson7.level2;

public interface Mother {
    default void resolve() {
        System.out.println("Mother resolve");
    }
}
