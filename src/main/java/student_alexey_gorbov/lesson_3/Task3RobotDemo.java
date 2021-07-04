package student_alexey_gorbov.lesson_3;

public class Task3RobotDemo {
    public static void main(String[] args) {
        Task1Robot robot = new Task1Robot();
        robot.sayHello();
        robot.sayYourName();

        Task1Robot robot2 = new Task1Robot();
        robot2.sayHello();
        robot2.sayYourName();

        Task1Robot robot3 = new Task1Robot("Rob1");
        Task1Robot robot4 = new Task1Robot("Rob2");

        robot3.sayHello();
        robot3.sayYourName();
        robot4.sayHello();
        robot4.sayYourName();

    }
}
