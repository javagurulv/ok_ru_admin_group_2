package student_dmitry_drozdetsky.lesson_3.level_3.Task_11;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RoboDemo {
    public static void main(String[] args) {

        Robot robot1 = new Robot("R2-D2");
        Robot robot2 = new Robot("C-3PO");

        robot1.sayHello();
        robot1.sayYourName();

        robot2.sayHello();
        robot2.sayYourName();
    }
}
