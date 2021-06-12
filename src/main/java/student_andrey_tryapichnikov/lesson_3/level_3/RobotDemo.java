package student_andrey_tryapichnikov.lesson_3.level_3;

public class RobotDemo {
    static final String RED="160";
    static final String BLUE="33";

    public static void main(String[] args) {
        var robot1 = new Robot("Flotsam", RED);
        robot1.sayHello();
        robot1.sayYourName();

        var robot2 = new Robot("Jetsam", BLUE);
        robot2.sayHello();
        robot2.sayYourName();
    }
}
