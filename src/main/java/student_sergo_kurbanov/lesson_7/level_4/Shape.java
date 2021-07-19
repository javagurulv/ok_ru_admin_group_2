package student_sergo_kurbanov.lesson_7.level_4;

public abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}