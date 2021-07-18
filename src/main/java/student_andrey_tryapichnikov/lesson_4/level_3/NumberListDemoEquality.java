package student_andrey_tryapichnikov.lesson_4.level_3;

import student_andrey_tryapichnikov.boilerplate.ScannerQuery;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class NumberListDemoEquality {
    public static void main(String[] args) {
        var numbers = ScannerQuery.queryNumberDefault(3);
        var numberList = new NumberList(numbers);

        switch (numberList.relationText) {
            case "equal" -> System.out.println("All numbers are equal");
            case "different", "ascending", "descending" -> System.out.println("All numbers are different");
            default -> System.out.println("Neither all are equal or different");
        }
    }
}
