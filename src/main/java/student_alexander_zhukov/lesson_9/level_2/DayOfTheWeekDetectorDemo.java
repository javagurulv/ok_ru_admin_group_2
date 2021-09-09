package student_alexander_zhukov.lesson_9.level_2;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {
    private DayOfTheWeekDetector dayDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayDetector) {
        this.dayDetector = dayDetector;
    }

    public static void main(String[] args) {
        //DayOfTheWeekDetectorDemo demo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        //DayOfTheWeekDetectorDemo demo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        DayOfTheWeekDetectorDemo demo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day number [1-7]: ");
        int number = scanner.nextInt();
        System.out.println(demo.dayDetector.detectDayName(number));
    }
}
