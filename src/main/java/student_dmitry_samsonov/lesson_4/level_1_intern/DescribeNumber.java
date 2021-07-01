package student_dmitry_samsonov.lesson_4.level_1_intern;

import java.util.Scanner;

class DescribeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter whole number: ");
        var number = scanner.nextInt();
        String number_type, number_positivity;
        if (isEven(number)) {
            number_type = "even";
        } else {
            number_type = "odd";
        }
        if (isPositive(number)) {
            number_positivity = "positive";
        } else if (isZero(number)) {
            number_positivity = "zero";
        } else {
            number_positivity = "negative";
        }
        System.out.println(number + " is " + number_type + ", " + number_positivity + ", " + numberToWeekday(number));
    }
    static boolean isEven (int number) {
        return number % 2 == 0;
    }
    static boolean isPositive (int number) {
        return number > 0;
    }
    static boolean isZero (int number) {
        return number == 0;
    }
    static String numberToWeekday (int number) {
        switch (number) {
            case 1: {
                return "Monday";
            }
            case 2: {
                return "Tuesday";
            }
            case 3: {
                return "Wednesday";
            }
            case 4: {
                return "Thursday";
            }
            case 5: {
                return "Friday";
            }
            case 6: {
                return "Saturday";
            }
            case 7: {
                return "Sunday";
            }
            default: {
                return "not a weekday";
            }
        }
    }
}
