package student_andrey_tryapichnikov.lesson_9.level_2;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {
    private final DayOfTheWeekDetector detector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    void run(int dayNumber) {
        var currentDay = detector.detectDayName(dayNumber);
        System.out.println(currentDay);
    }

    public static void main(String[] args) {
        DayOfTheWeekDetector[] tests = {
                new DayOfTheWeekDetectorIfVersion(),
                new DayOfTheWeekDetectorSwitchVersion(),
                new DayOfTheWeekDetectorListVersion()
        };
        var scanner = new Scanner(System.in);
        System.out.print("Enter day number: ");
        var dayNumber = scanner.nextInt();
        for (DayOfTheWeekDetector i: tests) {
            var detectorDemo = new DayOfTheWeekDetectorDemo(i);
            detectorDemo.run(dayNumber);
        }
    }
}
