package student_dmitry_drozdetsky.lesson_7.level_5.Task_23;

abstract class Shape {
    private final String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

    public String getTitle() {
        return title;
    }
}
