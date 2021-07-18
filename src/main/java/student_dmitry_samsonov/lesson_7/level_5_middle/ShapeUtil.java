package student_dmitry_samsonov.lesson_7.level_5_middle;

import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ShapeUtil {
    Circle createRandomCircle(){
        Random random = new Random();
        Circle circle = new Circle(random.nextInt(10));
        return circle;
    }
    Square createRandomSquare(){
        Random random = new Random();
        Square square = new Square(random.nextInt(10));
        return square;
    }
    Rectangle createRandomRectangle() {
        Random random = new Random();
        Rectangle rectangle = new Rectangle(random.nextInt(10), random.nextInt(10));
        return rectangle;
    }
    Triangle createRandomTriangle(){
        Random random = new Random();
        Triangle triangle = new Triangle(random.nextInt(10));
        return triangle;
    }
    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }
    double calculateArea(Shape[] shapes){
        double areaSum = 0;
        for (Shape shape: shapes) {
            areaSum += shape.calculateArea();
        }
        return areaSum;
    }
    double calculatePerimeter(Shape[] shapes){
        double perimeterSum = 0;
        for (Shape shape: shapes) {
            perimeterSum += shape.calculatePerimeter();
        }
        return perimeterSum;
    }
    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

}