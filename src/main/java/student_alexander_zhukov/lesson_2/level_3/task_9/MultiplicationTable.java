package student_alexander_zhukov.lesson_2.level_3.task_9;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner myInput = new Scanner( System.in );
        System.out.println("Input a number: ");
        int num = myInput.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}
