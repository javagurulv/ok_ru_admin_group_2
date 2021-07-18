package student_dmitry_samsonov.lesson_8.level_3_junior;

import teacher.codereview.CodeReview;

@CodeReview(approved = false)
public class SuperClassConstructorInvoker {
    public SuperClassConstructorInvoker() {
        System.out.println(1);
        //super(); // потому что вызов конструктора должен стоять первой командой в конструкторе. Данный класс наследуется от Object
        // Потому что класс не является наследником
        System.out.println(2);
    }
}