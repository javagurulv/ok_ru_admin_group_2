package student_andrey_domas.lesson4.level1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        System.out.print("Enter a day number: ");
        Scanner scanner = new Scanner(System.in);
        final int iDay = scanner.nextInt();

        Map<Integer, String> daysOfWeekMap = new HashMap<>() {{
            put(1, "Monday");
            put(2, "Tuesday");
            put(3, "Wednesday");
            put(4, "Thursday");
            put(5, "Friday");
            put(6, "Saturday");
            put(7, "Sunday");
        }};

        String sDay = daysOfWeekMap.getOrDefault(iDay, "Are you a human?");
        System.out.println(sDay);
    }
}
