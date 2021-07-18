package student_dmitry_samsonov.lesson_3.level_7_senior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Circle {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    static double square(double number) {
        return number * number;
    }
    double calculateArea() {
        return Math.PI * square(this.radius);
    }
}
