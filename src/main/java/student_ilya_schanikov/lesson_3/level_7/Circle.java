package student_ilya_schanikov.lesson_3.level_7;

import java.lang.Math;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Circle {
    double radius;
    public Circle(double radiusSize) {
        this.radius = radiusSize;
    }

    void calculateArea() {
        System.out.println("Circle radius is: " + this.radius);
        System.out.println("Circle area is: " + (this.radius*this.radius*Math.PI));

    }

}


class CircleDemo {
    public static void main(String[] args) {
        Circle Circle1 = new Circle(10);
        Circle1.calculateArea();

        }
    }