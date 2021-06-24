package student_alexander_zhukov.lesson_3.level_3;

class RobotDemo {
    public static void main(String[] args) {
        Robot myRobot = new Robot("Robot1");

        myRobot.sayHello();
        myRobot.sayYourName();

        Robot robot1 = new Robot("Rider");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("John");
        robot2.sayHello();
        robot2.sayYourName();
    }
}
