package student_alexander_fateev.lesson5.level_4.task26;

import java.util.Scanner;

class RandomUserArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int arrayLength = scan.nextInt();
        int [] numbers = new int[arrayLength];

        for (int i=0; i<arrayLength; i++) {
            numbers[i] = (int) (Math.random()*100);
            System.out.println("Element " + i + " = " + numbers[i]);
        }
    }
}
