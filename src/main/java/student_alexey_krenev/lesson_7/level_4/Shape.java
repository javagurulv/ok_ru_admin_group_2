package student_alexey_krenev.lesson_7.level_4;

abstract class Shape {
    private String title;

    public Shape(String title) {
        this.title = title;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();


}
