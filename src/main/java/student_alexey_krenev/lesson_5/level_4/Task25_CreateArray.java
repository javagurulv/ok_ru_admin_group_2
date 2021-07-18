package student_alexey_krenev.lesson_5.level_4;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Task25_CreateArray {

    public static void main(String[] args) {
        System.out.println("Insert int array length");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();

        int [] array = new int[arrayLength];

        for(int i=0; i < arrayLength; i++){
            System.out.println("Insert int for array element №: " + i);
            int input = scanner.nextInt();
            array[i] = input;

        }

        System.out.println("All array data");
        for(int i=0; i < arrayLength; i++){
            System.out.println(array[i]);
        }


    }
}
