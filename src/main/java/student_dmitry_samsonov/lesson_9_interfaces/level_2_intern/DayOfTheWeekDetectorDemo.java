package student_dmitry_samsonov.lesson_9_interfaces.level_2_intern;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {
    private DayOfTheWeekDetector detectorInterface;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detectorInterface) {
        this.detectorInterface = detectorInterface;
    }

    public static void main(String[] args) {
        run();
    }
    public static void run(){
        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        DayOfTheWeekDetector detectorIf = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetector detectorList = new DayOfTheWeekDetectorListVersion();
        DayOfTheWeekDetector detectorSwitch = new DayOfTheWeekDetectorSwitchVersion();

        DayOfTheWeekDetectorDemo detectorDemoIf = new DayOfTheWeekDetectorDemo(detectorIf);
        DayOfTheWeekDetectorDemo detectorDemoList = new DayOfTheWeekDetectorDemo(detectorList);
        DayOfTheWeekDetectorDemo detectorDemoSwitch = new DayOfTheWeekDetectorDemo(detectorSwitch);

        System.out.println(detectorDemoIf.detectorInterface.detectDayName(number));
        System.out.println(detectorDemoList.detectorInterface.detectDayName(number));
        System.out.println(detectorDemoSwitch.detectorInterface.detectDayName(number));
    }
}
