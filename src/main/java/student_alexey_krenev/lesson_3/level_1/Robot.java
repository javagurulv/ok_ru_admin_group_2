package student_alexey_krenev.lesson_3.level_1;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class Robot {
    public void sayHello() {
        System.out.println("Hello!"); // тут напишите команду распечатки на консоли строки "Hello!"
    }

    @CodeReviewComment(teacher = "Конструкторы класса объявляются впереди всех методов. Привычная последовательность: константы, свойства, конструкторы, методы.")
    public Robot() {

    }
    public void sayYourName() {
        System.out.println("My name is ROBO");// тут напишите команду распечатки на консоли строки "My name is ROBO"
    }
}
