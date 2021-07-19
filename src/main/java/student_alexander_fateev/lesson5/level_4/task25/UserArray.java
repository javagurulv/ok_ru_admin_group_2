package student_alexander_fateev.lesson5.level_4.task25;

import java.util.Scanner;

class UserArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int arrayLength = scan.nextInt();
        int [] numbers = new int[arrayLength];

        for (int i=0; i<arrayLength; i++) {
            System.out.print("Enter element " + i + ": ");
            numbers[i] = scan.nextInt();
        }

        for (int i=0; i<arrayLength; i++) {
            System.out.println("Element " + i + " = " + numbers[i]);
        }
    }
}
