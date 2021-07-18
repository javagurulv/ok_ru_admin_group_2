package student_andrey_tryapichnikov.lesson_4.level_3;

import student_andrey_tryapichnikov.boilerplate.ScannerQuery;
import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class NumberListDemoDirection {
    public static void main(String[] args) {
        var numbers = ScannerQuery.queryNumberDefault(3);
        var numberList = new NumberList(numbers);

        switch (numberList.relationText) {
            case "ascending" -> System.out.println("increasing");
            case "descending" -> System.out.println("decreasing");
            default -> System.out.println("Neither increasing or decreasing order");
        }
    }
}
