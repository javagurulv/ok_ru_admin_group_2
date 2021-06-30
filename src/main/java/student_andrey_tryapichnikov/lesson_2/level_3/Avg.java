package student_andrey_tryapichnikov.lesson_2.level_3;

import java.util.Scanner;

public class Avg {
    private static final int DEFAULT_LENGTH = 3;

    static double avg(int[] numbers) {
        double sum = 0;
        for (int number: numbers) sum += number;
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        // support an argument, and have fun entering as many integers as you like ;)
        int arrayLength;
        if (args.length == 0) arrayLength = DEFAULT_LENGTH;
        else arrayLength = Integer.parseInt(args[0]);

        var scanner = new Scanner(System.in);
        var numbers = new int[arrayLength];

        System.out.printf("Please input %s integers:\n", arrayLength);
        for (int c = 0; c < numbers.length; c++) numbers[c] = scanner.nextInt();

        System.out.printf("Average: %s\n", avg(numbers));
    }
}
