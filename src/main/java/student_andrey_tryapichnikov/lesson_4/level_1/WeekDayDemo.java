package student_andrey_tryapichnikov.lesson_4.level_1;

import java.util.Scanner;

// don't forget to try it with 3 ;)
public class WeekDayDemo {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Enter day number: ");
        var number = scanner.nextInt();

        var day = WeekDay.getDayName(number);

        if (day == null) {
            System.out.println("Wrong number!");
            System.exit(1);
        }

        System.out.println(day);
    }
}
