package student_sergo_kurbanov.lesson_3.level_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class RobotDemo {
    public static void main(String[] args) {
        var robot = new Robot();

        robot.sayHello();
        robot.sayYourName();

        Robot robot1 = new Robot();
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot();
        robot2.sayHello();
        robot2.sayYourName();
    }
}
