package student_artem_aleksandrov.lesson3;

import java.util.ArrayList;

public class RobotDemo {


    public static void main(String[] args) {

        int numberOfRobots = 10;
        ArrayList<Robot> army = new ArrayList<Robot>();

        Robot robot = new Robot("ROBO");

        robot.sayHello();
        robot.sayYourName();

        for (int i = 0; i < numberOfRobots; i++) {
            Robot armyRobot = new Robot();

            armyRobot.setName("ROBO-%s".formatted(String.valueOf(i)));
            army.add(armyRobot);
            armyRobot.sayYourName();
        }
    }
}