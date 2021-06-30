package student_andrey_domas.lesson3.level7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
