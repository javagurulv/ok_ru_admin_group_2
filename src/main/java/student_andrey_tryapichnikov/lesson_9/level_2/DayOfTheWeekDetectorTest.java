package student_andrey_tryapichnikov.lesson_9.level_2;

public class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        // test if impl
        var implIf = new DayOfTheWeekDetectorIfVersion();
        testDay(implIf, -1, "Please input a valid number between 1 and 7");
        testDay(implIf, 1, "Monday");
        testDay(implIf, 4, "Thursday");
        testDay(implIf, 11, "Please input a valid number between 1 and 7");
        // test switch impl
        var implSwitch = new DayOfTheWeekDetectorSwitchVersion();
        testDay(implSwitch, -25, "Wrong number");
        testDay(implSwitch, 2, "Tuesday");
        testDay(implSwitch, 3, "It's Wednesday my dudes");
        testDay(implSwitch, 100, "Wrong number");
        // test list impl
        var implList = new DayOfTheWeekDetectorListVersion();
        testDay(implList, -11, "Wrong number");
        testDay(implList, 3, "It's Wednesday my dudes");
        testDay(implList, 7, "Sunday");
        testDay(implList, 999, "Wrong number");
    }
    private static void testDay(DayOfTheWeekDetector dayObject, int dayNumber, String expectedValue) {
        var result = expectedValue.equals(dayObject.detectDayName(dayNumber)) ? "Success!" : "Failure";
        System.out.println(result);
    }
}
