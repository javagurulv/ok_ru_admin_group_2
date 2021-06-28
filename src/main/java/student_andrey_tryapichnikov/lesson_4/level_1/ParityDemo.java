package student_andrey_tryapichnikov.lesson_4.level_1;

import java.util.Scanner;

public class ParityDemo {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        var number = scanner.nextInt();

        String parity = Parity.isEven(number) ? "even" : "odd";
        System.out.printf("The number %s is %s!\n", number, parity);
    }
}
