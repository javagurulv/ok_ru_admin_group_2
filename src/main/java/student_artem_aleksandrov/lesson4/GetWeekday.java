package student_artem_aleksandrov.lesson4;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class GetWeekday {
    public static void main(String[] args) {

        String[] week = new String[8];
        week[1] = "SUNDAY";
        week[2] = "MONDAY";
        week[3] = "TUESDAY";
        week[4] = "WEDNESDAY";
        week[5] = "THURSDAY";
        week[6] = "FRIDAY";
        week[7] = "SATURDAY";

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println(week[number]);
    }
}
