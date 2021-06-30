package student_andrey_tryapichnikov.lesson_4.level_1;

import student_andrey_tryapichnikov.boilerplate.ScannerQuery;

import java.util.Scanner;

public class ParityDemo {
    public static void main(String[] args) {
        var number = ScannerQuery.queryNumberDefault(1)[0];

        String parity = Parity.isEven(number) ? "even" : "odd";
        System.out.printf("The number %s is %s!\n", number, parity);
    }
}
