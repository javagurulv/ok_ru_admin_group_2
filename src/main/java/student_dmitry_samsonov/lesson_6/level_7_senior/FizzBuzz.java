package student_dmitry_samsonov.lesson_6.level_7_senior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FizzBuzz {
    public String detect(int number) {
        String result = "";
        if (number % 3 == 0) {
            result = result + "Fizz";
        }
        if (number % 5 == 0) {
            result = result + "Buzz";
        }
        if (result.equals("")) {
            result = result + number;
        }
        return result;
    }
}
