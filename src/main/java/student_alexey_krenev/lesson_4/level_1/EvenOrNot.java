package student_alexey_krenev.lesson_4.level_1;

import java.util.Scanner;

public class EvenOrNot {
    public static void main(String[] args) {
        System.out.println("Insert Int number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();


        if(num % 2 == 0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is not even");
        }
    }
}
