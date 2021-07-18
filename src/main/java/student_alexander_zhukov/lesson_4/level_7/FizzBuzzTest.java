package student_alexander_zhukov.lesson_4.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest testFB = new FizzBuzzTest();

        testFB.testFizzBuzz(3, "Fizz");
        testFB.testFizzBuzz(15, "FizzBuzz");
        testFB.testFizzBuzz(21, "Fizz");
        testFB.testFizzBuzz(20, "Buzz");
        testFB.testFizzBuzz(2, "2");
        testFB.testFizzBuzz(37, "37");
    }

    public void testFizzBuzz(int number, String answer) {
        FizzBuzz fbTest = new FizzBuzz();
        if (fbTest.detect(number).equals(answer)) {
            System.out.println("FizzBuzz test - " + number + " = OK");
        }
        else {
            System.out.println("FizzBuzz test - " + number + " = FAIL");
        }

    }
}
