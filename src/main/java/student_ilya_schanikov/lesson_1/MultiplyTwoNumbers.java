package student_ilya_schanikov.lesson_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        int x = 50;
        int y = 3;
        int mult = x * y;
        System.out.println(mult);
    }
}

//import java.util.Scanner;
//
//public class MultiplyTwoNumbers {
//    public static void main(String[] args) {
//        int x, y, mult;
//        Scanner incomingNumber = new Scanner(System.in);
//        System.out.println("Enter first number:");
//        x = incomingNumber.nextInt();
//        System.out.println("Enter second number:");
//        y = incomingNumber.nextInt();
//        mult = x * y ;
//        System.out.println("Answer is:" + mult);
//    }
//}
