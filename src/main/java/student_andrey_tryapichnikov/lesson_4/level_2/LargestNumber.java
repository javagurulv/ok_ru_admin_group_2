package student_andrey_tryapichnikov.lesson_4.level_2;

import student_andrey_tryapichnikov.boilerplate.ScannerQuery;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        var numbers = ScannerQuery.queryNumberDefault(2);

        if (NumberComparison.numbersEqual(numbers[0], numbers[1])) System.out.println("Numbers are equal!");
        else System.out.printf("%s is the largest.", NumberComparison.getLargest(numbers[0], numbers[1]));
    }
}