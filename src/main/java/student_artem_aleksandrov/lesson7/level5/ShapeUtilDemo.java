package student_artem_aleksandrov.lesson7.level5;
import student_artem_aleksandrov.lesson7.level4.Shape;


public class ShapeUtilDemo {
    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);

    }
}
