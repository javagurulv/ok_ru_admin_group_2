package student_andrey_tryapichnikov.lesson_4.level_1;

import java.util.Scanner;

public class OddEvenTest {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        var number = scanner.nextInt();
        String type;
        if (number % 2 == 0) type = "even";
        else type = "odd";
        System.out.printf("The number is %s!\n", type);
    }
}
