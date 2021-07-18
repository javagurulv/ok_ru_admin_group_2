package student_ilya_schanikov.lesson_4.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FizzBuzz {
    int number;

    public String detect(int newNumber) {
        this.number = newNumber;
        if (((this.number % 3) == 0) && ((this.number % 5) == 0)){
            return "FizzBuzz";
        } else if ((this.number % 3) == 0) {
            return "Fizz";
        } else if ((this.number % 5) == 0) {
            return "Buzz";
        } else {
            return  ("" + this.number);
        }
    }
}

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fz1 = new FizzBuzzTest();
        fz1.BuzzTest();
        fz1.FizzTest();
        fz1.BuzzFizzTest();
        fz1.MissTest();

    }

    public void BuzzTest() {
        int newNumber = 10;
        String expectedResult = "Buzz";
        FizzBuzz detector = new FizzBuzz();
        String realResult = detector.detect(newNumber);
        if (realResult.equals(expectedResult)) {
            System.out.println("Buzz test = PASS");
        } else {
            System.out.println("Buzz test = FAIL");
        }
    }

    public void FizzTest() {
        int newNumber = 9;
        String expectedResult = "Fizz";
        FizzBuzz detector = new FizzBuzz();
        String realResult = detector.detect(newNumber);
        if (realResult.equals(expectedResult)) {
            System.out.println("Fizz test = PASS");
        } else {
            System.out.println("Fizz test = FAIL");
        }
    }

    public void BuzzFizzTest() {
        int newNumber = 30;
        String expectedResult = "FizzBuzz";
        FizzBuzz detector = new FizzBuzz();
        String realResult = detector.detect(newNumber);
        if (realResult.equals(expectedResult)) {
            System.out.println("FizzBuzz test = PASS");
        } else {
            System.out.println("FizzBuzz test = FAIL");
        }
    }

    public void MissTest() {
        int newNumber = 29;
        String expectedResult = "29";
        FizzBuzz detector = new FizzBuzz();
        String realResult = detector.detect(newNumber);
        if (realResult.equals(expectedResult)) {
            System.out.println("Miss test = PASS");
        } else {
            System.out.println("Miss test = FAIL");
        }
    }
}