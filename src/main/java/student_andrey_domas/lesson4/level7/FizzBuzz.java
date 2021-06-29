package student_andrey_domas.lesson4.level7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class FizzBuzz {
    public String detect(int number) {
        if (number % 3 == 0) {
            if (number % 5 == 0)
                return "FizzBuzz";
            return "Fizz";
        } else if (number % 5 == 0)
            return "Buzz";
        else
            return Integer.toString(number);
    }
}
