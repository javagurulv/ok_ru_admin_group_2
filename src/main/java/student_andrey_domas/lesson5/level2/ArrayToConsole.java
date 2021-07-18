package student_andrey_domas.lesson5.level2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ArrayToConsole {
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        for (int i: a) {
            System.out.println(i);
        }
    }
}
