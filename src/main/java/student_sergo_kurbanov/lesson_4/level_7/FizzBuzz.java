package student_sergo_kurbanov.lesson_4.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class FizzBuzz {
    public String detect(int number) {
        boolean mod3 = (number % 3 == 0);
        boolean mod5 = (number % 5 == 0);

        if (!(mod3 || mod5)) {
            return "" + number;
        }
        if (mod3 && mod5) {
            return "FizzBuzz";
        }
        if (mod3) {
            return "Fizz";
        }
        return "Buzz";
    }
}
