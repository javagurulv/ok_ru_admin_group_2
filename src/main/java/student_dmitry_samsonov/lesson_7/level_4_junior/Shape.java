package student_dmitry_samsonov.lesson_7.level_4_junior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract int calculatePerimeter();
}