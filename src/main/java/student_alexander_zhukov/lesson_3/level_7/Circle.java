package student_alexander_zhukov.lesson_3.level_7;

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI*Math.pow(radius,2);
    }
}
