package student_andrey_tryapichnikov.lesson_4.level_7;

public class FizzBuzzTest {
    public static void main(String[] args) {
        testFB(9);
        testFB(10);
        testFB(30);
        testFB(91);
    }

    static void testFB(int number) {
        var fb = new FizzBuzz();
        var fbNumber = fb.detect(number);
        System.out.println(fbNumber);
    }
}
