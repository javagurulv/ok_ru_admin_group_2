package student_dmitry_samsonov.lesson_3.level_7_senior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(1.0);
        System.out.println("Circle with radius " + circle.radius + " has area of " + circle.calculateArea());
    }
}
