package student_artem_aleksandrov.lesson9.level2;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {

    public DayOfTheWeekDetector dayOfTheWeekDetectorImplementation;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetectorImplementation) {
        this.dayOfTheWeekDetectorImplementation = dayOfTheWeekDetectorImplementation;
    }

    public void run() {
        System.out.println("Input day of Week");

        Scanner scanner = new Scanner(System.in);
        int dayOfWeek = scanner.nextInt();
        System.out.println("You choice -  %s".formatted(dayOfTheWeekDetectorImplementation.detectDayName(dayOfWeek)));
    }

    public static void main(String[] args) {

        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorIf = new DayOfTheWeekDetectorDemo(
                new DayOfTheWeekDetectorIfVersion());
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorArray = new DayOfTheWeekDetectorDemo(
                new DayOfTheWeekDetectorArray());

        dayOfTheWeekDetectorIf.run();
        dayOfTheWeekDetectorArray.run();
    }
}
