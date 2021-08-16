package student_dmitry_samsonov.lesson_8_objects_equality_reflection.level_2_intern;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class MainClass {
    public static void main(String[] args) {
        C c = new C();
    }
    // По цепочке запускаются default конструкторы всех родительских классов начиная с самого верхнего в иерархии
}