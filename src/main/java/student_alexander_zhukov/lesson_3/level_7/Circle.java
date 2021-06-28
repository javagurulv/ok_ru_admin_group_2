package student_alexander_zhukov.lesson_3.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI*Math.pow(radius,2);
    }
}
