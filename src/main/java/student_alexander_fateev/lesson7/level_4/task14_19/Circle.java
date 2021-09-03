package student_alexander_fateev.lesson7.level_4.task14_19;

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    double calculatePerimeter() {
        return 2*Math.PI*radius;
    }
}
