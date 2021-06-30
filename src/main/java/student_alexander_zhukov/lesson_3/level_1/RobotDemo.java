package student_alexander_zhukov.lesson_3.level_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RobotDemo {
    public static void main(String[] args) {
        Robot myRobot = new Robot();

        myRobot.sayHello();
        myRobot.sayYourName();

        Robot robot1 = new Robot();
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot();
        robot2.sayHello();
        robot2.sayYourName();
    }
}
