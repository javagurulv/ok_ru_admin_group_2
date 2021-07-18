package student_sergo_kurbanov.lesson_3.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(12);
        System.out.printf("\nArea of circle with radius %.2f = %.2f", circle.getRadius(), circle.calculateArea());
    }
}
