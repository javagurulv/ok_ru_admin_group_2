package student_alexander_fateev.lesson6.level_7.task32;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();

        // Test case 1: division by 3: Fizz
        int number = 9;
        String expectedResult = "Fizz";
        String msg = "Fizz test";
        test.universalTest(number, expectedResult, msg);

        // Test case 2: division by 5: Buzz
        number = 10;
        expectedResult = "Buzz";
        msg = "Buzz test";
        test.universalTest(number, expectedResult, msg);

        // Test case 3: division by 3 and 5: FizzBuzz
        number = 15;
        expectedResult = "FizzBuzz";
        msg = "Buzz test";
        test.universalTest(number, expectedResult, msg);

        // Test case 4: other numbers
        number = 2;
        expectedResult = "2";
        msg = "Not Fizz, not buzz";
        test.universalTest(number, expectedResult, msg);
    }

    void universalTest(int number, String expectedResult, String msg) {
        FizzBuzz check = new FizzBuzz();
        String result = check.detect(number);

        if (result.equals(expectedResult)) {
            System.out.println(msg + ": OK");
        }
        else {
            System.out.println(msg + ": FAIL");
        }
    }
}
