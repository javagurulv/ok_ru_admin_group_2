package student_andrey_tryapichnikov.lesson_7.level_5;

public class ShapeUtilTest {
    public static void main(String[] args) {
        var shapeUtil = new ShapeUtil();
        var circle = shapeUtil.createRandomCircle();
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        var square = shapeUtil.createRandomSquare();
        System.out.println(square.getSide());
        var rectangle = shapeUtil.createRandomRectangle();
        System.out.println(rectangle.getSideA() + " x " + rectangle.getSideB());
        var triangle = shapeUtil.createRandomTriangle();
        System.out.println(triangle.getSide());
        Shape[] shapes = new Shape[10];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = shapeUtil.createRandomShape();
        }
        System.out.println(shapeUtil.calculateArea(shapes));
        System.out.println(shapeUtil.calculatePerimeter(shapes));
    }
}
