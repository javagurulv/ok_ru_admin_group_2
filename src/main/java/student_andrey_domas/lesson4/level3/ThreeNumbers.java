package student_andrey_domas.lesson4.level3;

import java.util.*;

/**
 * See tests also.
 */
public class ThreeNumbers {

    final static int N = 3;

    public static void main(String[] args) {
        // read N numbers and fill numbers array
        final int[] numbers = new int[N];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        if (isEqual(numbers))
            System.out.println("All numbers are equal");
        else if (isDifferent(numbers))
            System.out.println("All numbers are different");
        else
            System.out.println("Neither all are equal or different");

        if (isIncreasing(numbers))
            System.out.println("increasing");
        else if (isDecreasing(numbers))
            System.out.println("decreasing");
        else
            System.out.println("Neither increasing or decreasing order");

        System.out.println("Max number: " + getMax(numbers));
    }

    static boolean isEqual(int[] numbers) {
        for(int i = 1; i < numbers.length; i++)
            if (numbers[i - 1] != numbers[i])
                return false;
        return true;
    }

    static boolean isDifferent(int[] numbers) {
        for(int i = 1; i < numbers.length; i++)
            for (int j = 0; j < i; j++)
                if (numbers[j] == numbers[i])
                    return false;
        return true;
    }

    static boolean isIncreasing(int[] numbers) {
        for(int i = 1; i < numbers.length; i++)
            if (numbers[i - 1] > numbers[i])
                return false;
        return ! isEqual(numbers);  // all equals means no increasing
    }

    static boolean isDecreasing(int[] numbers) {
        for(int i = 1; i < numbers.length; i++)
            if (numbers[i - 1] < numbers[i])
                return false;
        return ! isEqual(numbers);  // all equals means no decreasing
    }

    static int getMax(int[] numbers) {
        int n = Integer.MIN_VALUE;
        for(int i: numbers)
            if (i > n)
                n = i;
        return n;
    }

}
