package student_alexey_krenev.lesson_3.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CircleDemo {
    public static void main(String[] args) {
        Circe newCircle = new Circe(9.35D);

        System.out.println("area of circle is " + newCircle.getSquare());
    }

}
