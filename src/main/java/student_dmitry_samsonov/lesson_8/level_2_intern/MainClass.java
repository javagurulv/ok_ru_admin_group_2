package student_dmitry_samsonov.lesson_8.level_2_intern;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class MainClass {
    public static void main(String[] args) {
        C c = new C();
    }
    // По цепочке запускаются default конструкторы всех родительских классов начиная с самого верхнего в иерархии
}