package student_andrey_domas.lesson5.level2;

import java.util.Random;

public class ArrayToConsoleWithRandom {
    public static void main(String[] args) {
        int a[] = new int[3];

        Random rnd = new Random();
        for (int i = 0; i < a.length; i++)
            a[i] = rnd.nextInt();

        for(int i: a)
            System.out.println(i);
    }
}