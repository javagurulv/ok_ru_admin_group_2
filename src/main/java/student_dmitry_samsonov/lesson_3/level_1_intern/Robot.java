package student_dmitry_samsonov.lesson_3.level_1_intern;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Robot {
    String name = "Marvin the Paranoid Android";
    Robot() {
    }
    void sayHello() {
        System.out.println("Hello!");
    }
    void sayYourName() {
        System.out.println("My name is " + this.name);
    }
}
