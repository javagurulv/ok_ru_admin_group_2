package student_dmitry_samsonov.lesson_3.level_3_junior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Robot {
    String name;
    Robot(String robotName) {
        this.name = robotName;
    }
    void sayHello() {
        System.out.println("Hello!");
    }
    void sayYourName() {
        System.out.println("My name is " + this.name);
    }
}
