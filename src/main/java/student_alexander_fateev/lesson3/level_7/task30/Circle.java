package student_alexander_fateev.lesson3.level_7.task30;

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI*(this.radius*this.radius);
    }
}
