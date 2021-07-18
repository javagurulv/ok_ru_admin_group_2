package student_dmitry_samsonov.lesson_4.level_7_senior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzbuzz = new FizzBuzzTest();
        fizzbuzz.fizzTest();
        fizzbuzz.buzzTest();
        fizzbuzz.fizbuzzTest();
        fizzbuzz.emptyTest();
    }

    void fizzTest(){
        int number = 3;
        String expectedResult = "Fizz";
        FizzBuzz fizzbuzz = new FizzBuzz();
        String result = fizzbuzz.detect(number);
        if (result.equals(expectedResult)) {
            System.out.println("Fizz test = OK");
        } else {
            System.out.println("Fizz test = FAIL");
        }
    }
    void buzzTest(){
        int number = 5;
        String expectedResult = "Buzz";
        FizzBuzz fizzbuzz = new FizzBuzz();
        String result = fizzbuzz.detect(number);
        if (result.equals(expectedResult)) {
            System.out.println("Buzz test = OK");
        } else {
            System.out.println("Buzz test = FAIL");
        }
    }
    void fizbuzzTest(){
        int number = 15;
        String expectedResult = "FizzBuzz";
        FizzBuzz fizzbuzz = new FizzBuzz();
        String result = fizzbuzz.detect(number);
        if (result.equals(expectedResult)) {
            System.out.println("FizzBuzz test = OK");
        } else {
            System.out.println("FizzBuzz test = FAIL");
        }
    }
    void emptyTest(){
        int number = 11;
        String expectedResult = "11";
        FizzBuzz fizzbuzz = new FizzBuzz();
        String result = fizzbuzz.detect(number);
        if (result.equals(expectedResult)) {
            System.out.println("Empty test = OK");
        } else {
            System.out.println("Empty test = FAIL");
        }
    }
}
