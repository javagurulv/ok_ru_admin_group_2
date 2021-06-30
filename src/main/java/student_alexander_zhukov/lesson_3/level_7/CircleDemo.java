package student_alexander_zhukov.lesson_3.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CircleDemo {
    public static void main(String[] args) {
        Circle myCircle = new Circle(3.4);
        var area = myCircle.calculateArea();
        System.out.println(area);
    }
}
