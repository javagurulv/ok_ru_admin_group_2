package student_sergo_kurbanov.lesson_7.level_3;

public abstract class Shape {
    private String name;

    abstract int area();

    abstract int perimeter();
}

class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    int area() {
        return width * height;
    }

    @Override
    int perimeter() {
        return width * height * 2;
    }
}

class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    int area() {
        return 3 * radius * radius;
    }

    @Override
    int perimeter() {
        return 2 * 3 * radius;
    }
}