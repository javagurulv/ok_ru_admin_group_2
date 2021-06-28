package student_alexander_fateev.lesson3.level_7.task30;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CircleDemo {
    public static void main(String[] args) {
        Circle myCircle = new Circle(10);
        System.out.println("Circle area is " + myCircle.calculateArea());
    }
}
