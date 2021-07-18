package student_sergo_kurbanov.lesson_3.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Circle {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return this.radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
