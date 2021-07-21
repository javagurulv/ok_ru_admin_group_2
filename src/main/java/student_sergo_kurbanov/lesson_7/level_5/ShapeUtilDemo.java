package student_sergo_kurbanov.lesson_7.level_5;

import student_sergo_kurbanov.lesson_7.level_4.Shape;

public class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();

        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);

        System.out.println(circleArea);
        System.out.println(circlePerimeter);
    }
}