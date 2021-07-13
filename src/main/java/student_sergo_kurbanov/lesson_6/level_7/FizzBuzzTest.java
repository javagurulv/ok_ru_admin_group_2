package student_sergo_kurbanov.lesson_6.level_7;


public class FizzBuzzTest {
    public static void main(String[] args) {
        int mod3 = 21;
        String mod3Result = "Fizz";
        int mod5 = 25;
        String mod5Result = "Buzz";
        int mod35 = 15;
        String mod35Result = "FizzBuzz";
        int none3none5 = 22;
        String none3none5Result = "" + none3none5;

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.detect(mod3, mod3Result);
        fizzBuzzTest.detect(mod5, mod5Result);
        fizzBuzzTest.detect(mod35, mod35Result);
        fizzBuzzTest.detect(none3none5, none3none5Result);
    }

    public void detect(int number, String result) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        System.out.println(fizzBuzz.detect(number).equals(result) ? "PASS" : "FAIL");
    }
}
