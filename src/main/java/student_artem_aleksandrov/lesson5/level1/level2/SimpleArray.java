package student_artem_aleksandrov.lesson5.level1.level2;
/*
Напишите программу, в которой:
 - создайте массив целых чисел длиной 3,
 - заполните каждую ячейку массива любым целым числом,
 - выведите значение каждой ячейки на консоль.
 */
import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class SimpleArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[3];
        int sum = 0;
        for (int i=0; i<3; i++) {
            numbers[i] = random.nextInt();
            System.out.println(numbers[i]);

            sum += numbers[i];
        }
        System.out.println("Sum: %s".formatted(sum));
        System.out.println("Avg: %s".formatted(sum / 3.0));
    }
}
