package student_andrey_tryapichnikov.lesson_4.level_3;

import student_andrey_tryapichnikov.boilerplate.ScannerQuery;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class GetMaxDemo {

    public static void main(String[] args) {
        var numbers = ScannerQuery.queryNumberDefault(3);
        var maxNum = GetMax.getMax(numbers);

        System.out.printf("The biggest number is %s\n", maxNum);
    }
}
