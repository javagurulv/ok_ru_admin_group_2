package student_alexander_fateev.lesson3.level_7.task30;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI*(this.radius*this.radius);
    }
}
