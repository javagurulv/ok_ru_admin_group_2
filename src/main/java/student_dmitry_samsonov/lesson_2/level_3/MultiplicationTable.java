package student_dmitry_samsonov.lesson_2.level_3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        var firstNumber = scanner.nextInt();
        for (var i=0; i<=10; i = i +1) {
            System.out.println(firstNumber + " x " + i + " = " + (firstNumber * i));
        }
    }
}
