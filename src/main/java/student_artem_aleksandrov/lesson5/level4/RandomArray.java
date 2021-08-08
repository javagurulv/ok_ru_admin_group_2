package student_artem_aleksandrov.lesson5.level4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class RandomArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Input array size");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];
        List<Integer> arrayEven = new ArrayList<>();
        List<Integer> arrayOdd = new ArrayList<>();


        for (int i=0; i<arraySize; i++) {
            array[i] = random.nextInt();
            if (isEven(array[i])) {
                arrayEven.add(array[i]);
            } else {
                arrayOdd.add(array[i]);
            }
        }

        System.out.println(Arrays.toString(array));

        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        System.out.println("Max: %s".formatted(max));
        System.out.println("Min: %s".formatted(min));
        System.out.println("Even Numbers: %s".formatted(arrayEven));
        System.out.println("Odd Numbers: %s".formatted(arrayOdd));

    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
