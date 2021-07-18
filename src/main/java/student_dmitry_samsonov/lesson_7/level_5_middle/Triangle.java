package student_dmitry_samsonov.lesson_7.level_5_middle;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Triangle extends Shape {
    private int side1;
    private int side2;
    private int side3;

    Triangle(int side) {
        super("Triangle");
        this.side1 = side;
        this.side2 = side;
        this.side3 = side;
    }
    @Override
    double calculateArea() {
        int s = calculatePerimeter() / 2;
        return Math.sqrt(s*(s-this.side1)*(s-this.side2)*(s-this.side3));

    }
    @Override
    int calculatePerimeter() {
        return this.side1 + this.side2 + this.side3;
    }
}
