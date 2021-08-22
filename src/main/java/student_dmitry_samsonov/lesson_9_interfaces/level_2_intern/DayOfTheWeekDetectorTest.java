package student_dmitry_samsonov.lesson_9_interfaces.level_2_intern;

public class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorIfVersion detectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorListVersion detectorListVersion = new DayOfTheWeekDetectorListVersion();
        DayOfTheWeekDetectorSwitchVersion detectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        printTestResult("Out of range If", detectorIfVersion.detectDayName(0).equals("Please input a valid number " +
                "between 1 and 7"));
        printTestResult("Out of range List", detectorListVersion.detectDayName(0).equals("Please input a valid number " +
                "between 1 and 7"));
        printTestResult("Out of range Switch", detectorSwitchVersion.detectDayName(0).equals("Please input a valid number " +
                "between 1 and 7"));

        printTestResult("Monday If", detectorIfVersion.detectDayName(1).equals("Monday"));
        printTestResult("Monday List", detectorListVersion.detectDayName(1).equals("Monday"));
        printTestResult("Monday Switch", detectorSwitchVersion.detectDayName(1).equals("Monday"));

        printTestResult("Tuesday If", detectorIfVersion.detectDayName(2).equals("Tuesday"));
        printTestResult("Tuesday List", detectorListVersion.detectDayName(2).equals("Tuesday"));
        printTestResult("Tuesday Switch", detectorSwitchVersion.detectDayName(2).equals("Tuesday"));

        printTestResult("Wednesday If", detectorIfVersion.detectDayName(3).equals("Wednesday"));
        printTestResult("Wednesday List", detectorListVersion.detectDayName(3).equals("Wednesday"));
        printTestResult("Wednesday Switch", detectorSwitchVersion.detectDayName(3).equals("Wednesday"));

        printTestResult("Thursday If", detectorIfVersion.detectDayName(4).equals("Thursday"));
        printTestResult("Thursday List", detectorListVersion.detectDayName(4).equals("Thursday"));
        printTestResult("Thursday Switch", detectorSwitchVersion.detectDayName(4).equals("Thursday"));

        printTestResult("Friday If", detectorIfVersion.detectDayName(5).equals("Friday"));
        printTestResult("Friday List", detectorListVersion.detectDayName(5).equals("Friday"));
        printTestResult("Friday Switch", detectorSwitchVersion.detectDayName(5).equals("Friday"));

        printTestResult("Saturday If", detectorIfVersion.detectDayName(6).equals("Saturday"));
        printTestResult("Saturday List", detectorListVersion.detectDayName(6).equals("Saturday"));
        printTestResult("Saturday Switch", detectorSwitchVersion.detectDayName(6).equals("Saturday"));

        printTestResult("Sunday If", detectorIfVersion.detectDayName(7).equals("Sunday"));
        printTestResult("Sunday List", detectorListVersion.detectDayName(7).equals("Sunday"));
        printTestResult("Sunday Switch", detectorSwitchVersion.detectDayName(7).equals("Sunday"));

        printTestResult("Out of range If", detectorIfVersion.detectDayName(8).equals("Please input a valid number " +
                "between 1 and 7"));
        printTestResult("Out of range List", detectorListVersion.detectDayName(8).equals("Please input a valid number " +
                "between 1 and 7"));
        printTestResult("Out of range Switch", detectorSwitchVersion.detectDayName(8).equals("Please input a valid number " +
                "between 1 and 7"));

    }
    static void printTestResult(String name, boolean result) {
        String reportName = name + " test = ";
        String reportResult;
        if (result) {
            reportResult = "OK";
        } else {
            reportResult = "FAIL";
        }
        System.out.println(reportName + reportResult);
    }
}
