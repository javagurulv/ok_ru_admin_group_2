package student_sergo_kurbanov.lesson_7.level_3;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    abstract int area();

    abstract int perimeter();
}

class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(String name, int width, int height) {
        super(name);
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

    public Circle(String name, int radius) {
        super(name);
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