package student_andrey_tryapichnikov.lesson_4.level_2;

import student_andrey_tryapichnikov.boilerplate.BoilerplateStatic;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class EqualNumbers {
    public static void main(String[] args) {
        var numbers = BoilerplateStatic.queryNumberDefault(2);

        if (NumberComparison.numbersEqual(numbers[0], numbers[1])) System.out.println("Numbers are equal!");
        else System.out.println("Numbers differ!");
    }
}
