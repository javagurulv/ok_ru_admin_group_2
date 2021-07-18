package student_dmitry_drozdetsky.lesson_3.level_1.Task_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RobotDemo {
    public static void main(String[] args) {

        Robot robot1 = new Robot();
        Robot robot2 = new Robot();

        robot1.sayHello();
        robot1.sayYourName();

        robot2.sayHello();
        robot2.sayYourName();
    }
}
