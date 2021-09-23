package student_alexey_krenev.lesson_7.level_4;

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;

    }


    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;

    }
}
