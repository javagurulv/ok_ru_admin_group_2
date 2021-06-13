package student_andrey_tryapichnikov.lesson_4.level_1;

import java.util.Scanner;

public class SignTest {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Enter integer:");
        var value = scanner.nextInt();
        if (value > 0) {
            System.out.println("positive!");
        } else if (value < 0) {
            System.out.println("negative!");
        } else {
            System.out.println("zero :<");
        }
    }
}
