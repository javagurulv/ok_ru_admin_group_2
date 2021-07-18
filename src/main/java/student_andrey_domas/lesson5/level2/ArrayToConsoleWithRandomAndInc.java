package student_andrey_domas.lesson5.level2;

import java.util.Arrays;
import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ArrayToConsoleWithRandomAndInc {
    public static void main(String[] args) {
        int a[] = new int[3];

        Random rnd = new Random();
        for (int i = 0; i < a.length; i++)
            a[i] = rnd.nextInt();

        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++)
            a[i] += 2;

        System.out.println(Arrays.toString(a));
    }
}
