package student_alexander_zhukov.lesson_7.level_4;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

}

class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    double calculatePerimeter() {
        return 2*Math.PI*radius;
    }

}

class Square extends Shape {

    private double side;

    Square (double side) {
        super("Square");
        this.side = side;
    }

    @Override
    double calculateArea() {
        return Math.pow(side,2);
    }

    @Override
    double calculatePerimeter() {
        return 4*side;
    }

}

class Rectangle extends Shape {
    private double sideA;
    private double sideB;


    Rectangle (double sideA, double sideB) {
        super("Rectangle");
        this.sideA = sideA;
        this.sideB = sideB;

    }

    @Override
    double calculateArea() {
        return sideA*sideB;
    }

    @Override
    double calculatePerimeter() {
        return 2*(sideA + sideB);
    }
}

class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    Triangle (double sideA, double sideB, double sideC) {
        super("Triangle");
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double calculateArea() {
        double p = calculatePerimeter()/2;
        return Math.sqrt(p*(p - sideA)*(p - sideB)*(p - sideC));
    }

    @Override
    double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}