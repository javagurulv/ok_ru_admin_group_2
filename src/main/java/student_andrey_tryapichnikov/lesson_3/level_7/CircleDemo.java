package student_andrey_tryapichnikov.lesson_3.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CircleDemo {
    public static void main(String[] args) {
        var circle = new Circle(15.6);
        System.out.println(circle.calculateArea());
    }
}
