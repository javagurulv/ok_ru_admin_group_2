package student_alexander_fateev.lesson3.level_1.task1_6;

public class RobotDemo {
    public static void main(String[] args) {
        Robot testBot = new Robot();

        testBot.sayHello();
        testBot.sayYourName();

        System.out.println("Robot1:");
        Robot robot1 = new Robot();
        robot1.sayHello();
        robot1.sayYourName();

        System.out.println("Robot2:");
        Robot robot2 = new Robot();
        robot2.sayHello();
        robot2.sayYourName();
    }
}
