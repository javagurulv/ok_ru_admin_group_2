package student_sergo_kurbanov.lesson_4.level_1;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter week day number 1-7: ");
        int numDayOfWeek = scanner.nextInt();
        String strDayOfWeek = "";

        if (numDayOfWeek < 1 || numDayOfWeek > 7) {
            System.out.printf("\nThe number should be in range 1-7: %d is incorrect!", numDayOfWeek);
            return;
        }

        switch (numDayOfWeek) {
            case 1:
                strDayOfWeek = "Monday";
                break;
            case 2:
                strDayOfWeek = "Tuesday";
                break;
            case 3:
                strDayOfWeek = "Wednesday";
                break;
            case 4:
                strDayOfWeek = "Thursday";
                break;
            case 5:
                strDayOfWeek = "Friday";
                break;
            case 6:
                strDayOfWeek = "Saturday";
                break;
            case 7:
                strDayOfWeek = "Sunday";
                break;
            default:
        }
        System.out.printf("\n%s", strDayOfWeek);
    }
}
