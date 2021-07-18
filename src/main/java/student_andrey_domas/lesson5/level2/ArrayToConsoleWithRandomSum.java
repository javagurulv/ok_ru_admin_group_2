package student_andrey_domas.lesson5.level2;

import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ArrayToConsoleWithRandomSum {
    public static void main(String[] args) {
        int a[] = new int[3];

        Random rnd = new Random();
        for (int i = 0; i < a.length; i++)
            a[i] = rnd.nextInt();

        int accum = 0;
        for(int i: a)
            accum += i;

        System.out.println(accum);
    }
}
