package student_andrey_tryapichnikov.lesson_2.level_3;

import java.util.Scanner;

public class Avg {
    static double avg(int[] numbers) {
        double sum = 0;
        for (int number: numbers) sum += number;
        return sum / numbers.length;
    }
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var numbers = new int[3];

        System.out.println("Please input 3 integers:");
        for (int c = 0; c < numbers.length; c++) numbers[c] = scanner.nextInt();

        System.out.printf("Average: %s\n", avg(numbers));
    }
}
