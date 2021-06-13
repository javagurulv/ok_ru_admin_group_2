package student_andrey_tryapichnikov.lesson_4.level_1;

import javax.lang.model.type.NullType;
import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Enter day number: ");
        var number = scanner.nextInt();
        String day;
        switch (number) {
            case 1 -> day = "Mondey";
            case 2 -> day = "Tuesday";
            case 3 -> day = "Wednesday";
            case 4 -> day = "Thursday";
            case 5 -> day = "Friday";
            case 6 -> day = "Saturday";
            case 7 -> day = "Sunday";
            default -> day = null;
        }
        if (day != null) System.out.println(day);
        else System.out.println("Wrong number!");
    }
}
