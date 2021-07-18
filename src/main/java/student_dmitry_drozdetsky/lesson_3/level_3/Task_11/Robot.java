package student_dmitry_drozdetsky.lesson_3.level_3.Task_11;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Robot {
    private String name;

    Robot(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }
}
