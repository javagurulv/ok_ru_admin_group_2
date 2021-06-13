package student_andrey_tryapichnikov.lesson_4.level_2;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Enter two numbers for comparison.");
        var number1 = scanner.nextInt();
        var number2 = scanner.nextInt();
        if (NumberComparison.numbersEqual(number1, number2)) System.out.println("Numbers are equal!");
        else System.out.printf("%s is the largest.", NumberComparison.getLargest(number1, number2));
    }
}
