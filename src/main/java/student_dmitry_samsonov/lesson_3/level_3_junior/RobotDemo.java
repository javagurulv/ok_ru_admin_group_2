package student_dmitry_samsonov.lesson_3.level_3_junior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RobotDemo {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Rider");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("John");
        robot2.sayHello();
        robot2.sayYourName();
    }
}
