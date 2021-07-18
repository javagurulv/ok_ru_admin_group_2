package student_alexander_fateev.lesson5.level_2.task11;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class IntUserArray {
    public static void main(String[] args) {
        int [] numbers = new int[3];
        Scanner scan = new Scanner(System.in);

        for (int i=0; i<=2; i++) {
            System.out.print("Input element " + i + ": ");
            numbers[i] = scan.nextInt();
        }

        for (int i=0; i<=2; i++) {
            System.out.println("Element " + i + " = " + numbers[i]);
        }
    }
}
