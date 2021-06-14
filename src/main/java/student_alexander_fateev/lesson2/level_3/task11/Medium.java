package student_alexander_fateev.lesson2.level_3.task11;

import java.util.Scanner;

public class Medium {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tmpResult = 0;

        System.out.print("Input three integers\n");
        for (int i = 0; i <= 2; i++) {
            System.out.print((i + 1) + ":");
            tmpResult = tmpResult + scan.nextInt();
        }

        System.out.print("Average: " + (tmpResult/3));
    }
}
