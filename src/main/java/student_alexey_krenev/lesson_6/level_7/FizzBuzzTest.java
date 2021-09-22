package student_alexey_krenev.lesson_6.level_7;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();

        // fizz
        test.testFizzBuzz(3, "Fizz");
        // buzz
        test.testFizzBuzz(5, "Buzz");
        //fizzbuzz
        test.testFizzBuzz(15, "FizzBuzz");

    }

    public void testFizzBuzz(int number, String expectedResult){
        FizzBuzz check = new FizzBuzz();

        String result = check.detect(number);

        System.out.println(result);
        if (result.equals(expectedResult)) {
            System.out.println("Test SUCCESS");
        } else {
            System.out.println("Test FAIL");
        }

    }
}