package student_andrey_domas.lesson10.ui;

public interface UIAction {

    void execute();

    default void bookNotFound() {
        System.out.println("book not found");
    }

}