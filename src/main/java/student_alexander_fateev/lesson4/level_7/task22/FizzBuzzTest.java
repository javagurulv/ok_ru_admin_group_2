package student_alexander_fateev.lesson4.level_7.task22;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz testBuzz = new FizzBuzz();

        // Test case 1
        if (testBuzz.detect(6).equals("Fizz")) {
            System.out.println("Fizz: OK");
        }
        else {
            System.out.println("Fizz: FAIL");
        }

        // Test case 2
        if (testBuzz.detect(25).equals("Buzz")) {
            System.out.println("Buzz: OK");
        }
        else {
            System.out.println("Buzz: FAIL");
        }

        // Test case 3
        if (testBuzz.detect(15).equals("FizzBuzz")) {
            System.out.println("FizzBuzz: OK");
        }
        else {
            System.out.println("FizzBuzz: FAIL");
        }

        // Test case 4
        if (testBuzz.detect(7).equals("7")) {
            System.out.println("NO Fizz NO Buzz: OK");
        }
        else {
            System.out.println("NO Fizz NO Buzz: FAIL");
        }
    }
}
