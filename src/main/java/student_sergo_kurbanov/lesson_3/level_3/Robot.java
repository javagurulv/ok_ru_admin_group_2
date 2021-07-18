package student_sergo_kurbanov.lesson_3.level_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Robot {
    String name;

    public Robot() {
    }

    Robot(String robotName) {
        this.name = robotName;
    }

    void sayHello() {
        System.out.println("Hello!");
    }

    void sayYourName() {
        System.out.printf("\nMy name is %s!", name);
    }
}
