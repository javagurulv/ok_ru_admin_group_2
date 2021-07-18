package student_andrey_tryapichnikov.lesson_5.level_2;

import student_andrey_tryapichnikov.boilerplate.ScannerQuery;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayFill2 {
    public static void main(String[] args) {
        var numbers = ScannerQuery.queryNumberDefault(3);
        for (int i: numbers) System.out.println(i);
    }
}
