package student_andrey_tryapichnikov.lesson_4.level_3;

import java.util.Scanner;

public class GetMax {
    static final int ITEMS = 3;

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int[] numbers = new int[ITEMS];
        numbers[0] = scanner.nextInt();
        numbers[1] = scanner.nextInt();
        numbers[2] = scanner.nextInt();
        var maxNum = getMax(numbers);

        System.out.printf("The biggest number is %s\n", maxNum);
    }

    // we only need to find the highest value, the rest does not matter no point
    // in comparing all the numbers, just compare them in sequence gradually
    // replacing the return value with the max number available
    static int getMax(int[] numbers) {
        int maxNum = numbers[0];
        // I'd use a slice here, but this is no Python, so we compare the first
        // number against itself; still better than doing a > b -> b > c?..
        for (int n: numbers) {
            if (n > maxNum) maxNum = n;
        }
        return maxNum;
    }
}
