package student_dmitry_samsonov.lesson_8_objects_equality_reflection.level_3_junior;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(student = "Исправил, но вы на уроке говорили, что компилятор сам вставит super() первой строкой, " +
        "поэтому я и не стал его писать, а ошибки компиляции это не даёт." +
        "Правда в интернетах пишут что преимущество его наличия в том, что в IDE становится удобно навигировать в " +
        "конструктор родительского класса, так что есть стимул для явного прописывания.")
class SuperClassConstructorInvoker {
    public SuperClassConstructorInvoker() {
        super();
        System.out.println(1);
        // // потому что вызов конструктора должен стоять первой командой в конструкторе. Данный класс наследуется от Object
        // Потому что класс не является наследником
        System.out.println(2);
    }
}