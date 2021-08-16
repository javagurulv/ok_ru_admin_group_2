package student_andrey_domas.lesson9.level2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {
    private DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day number [1-7]: ");
        DayOfTheWeekDetectorDemo self = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());

        int dayNumbmber = 999;
        try {
            dayNumbmber = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(self.dayOfTheWeekDetector.detectDayName(dayNumbmber));
            return;
        }

        System.out.println(self.dayOfTheWeekDetector.detectDayName(dayNumbmber));
    }
}
