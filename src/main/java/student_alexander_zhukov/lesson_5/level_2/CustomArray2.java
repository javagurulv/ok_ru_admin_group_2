package student_alexander_zhukov.lesson_5.level_2;

import java.util.Scanner;

class CustomArray2 {
    public static void main(String[] args) {
        int[] myArray = new int[3];

        Scanner myInput = new Scanner( System.in );
        System.out.println("Input numbers (int): ");
        myArray[0] = myInput.nextInt();
        myArray[1] = myInput.nextInt();
        myArray[2] = myInput.nextInt();

        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[2]);
    }
}
